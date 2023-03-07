package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.n1 = 1;
		//		p.n2 = 2; (X)자식 객체가 가지고있는 고유 객체이기때문에 부모는 알 수 없다.

		p.method1();
		p.method2();
		//		p.method3();(X)

		System.out.println("------------------------");

		Child c = new Child();
		c.n1 = 1;
		c.n2 = 2;

		c.method1();
		c.method2();
		c.method3();

		System.out.println("------------------------");

		//다형성 적용(promotion)
		Parent p2 = new Child();
		p2.n1 = 1;
//		p2.n2 = 2;(X)
		
		p2.method1();
		p2.method2();
//		p2.method3();(X)

		/*
		 - 다형성이 적용되면 자식 클래스의
		  본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		  
		 - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 */

		Child c2 = (Child) p2;//부모 타입을 자식 타입으로 강제 변화(Downcasting)
		
		c2.n2 = 2;
		c2.method1();
		c2.method3();

		System.out.println("------------------------");
		
		System.out.println("p2의 주소값: " + p2);
		System.out.println("c2의 주소값: " + c2);

		//다형성이 한 번도 발생하지 않은 경우에는
		//강제 형 변환을 상용할 수 없습니다.
//		Parent ppp = new Parent();
//		Child c3 = (Child) ppp;
		
		System.out.println("------------------------");
	
		

















	}

}
