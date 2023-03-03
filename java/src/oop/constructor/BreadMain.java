package oop.constructor;

public class BreadMain {
	String name;
	int price;
	String ingredient;

	

	BreadMain() {
		name = "피자빵";
		price = 500;
		ingredient = "밀가루";
	}
	BreadMain(String bName, int bPrice, String bIngredient) {
		name = bName;
		price = bPrice;
		ingredient = bIngredient;
	}


	void info() {
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price + "원");
		System.out.println("주 재료: " + ingredient);

	}

	public static void main(String[] args) {


		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		 빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요.
		 클래스 이름은 Bread 로 통일하겠습니다.

		 -BreadMain에서 똑같이 피자빵, 초코케이크의 정보를
		 호출해 보세요.(생성자는 여러분들 맘대로~)
		 */

		BreadMain a = new BreadMain();
		a.info();
	
		System.out.println("----------------------------");
		
		BreadMain b = new BreadMain("초코케이크", 5000, "초콜렛");
		b.info();







	}

}
