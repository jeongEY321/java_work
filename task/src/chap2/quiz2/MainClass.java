package chap2.quiz2;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Main 메서드에서 Car 객체를 적절한 모델명과 함께 생성합니다.
	시동을 걸지 않은 상태에서 속도를 올려 봅니다.
	그 후 시동을 걸고 변속기를 D 모드로 지정한 후 속도를 100까지 올립니다.
	속도가 100인 상태에서 시동을 한 번 꺼 봅니다. 
	속도를 완전히 줄인 후 변속기를 P 모드로 지정하고 시동을 끕니다.
	*/
		
		Car c = new Car("노예");
		c.setSpeed(40);
		System.out.println("-----------------");
		c.engineStart();
		c.mode = 'D';
		c.setSpeed(100);
		System.out.println("-----------------");
		c.engineStop();
		System.out.println("-----------------");
		c.setSpeed(0);
		c.mode = 'P';
		c.engineStop();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}









