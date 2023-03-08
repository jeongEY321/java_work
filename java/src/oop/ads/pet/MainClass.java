package oop.ads.pet;

public class MainClass {

	public static void main(String[] args) {
		
		Pet dog = new Dog("개똥이", "똥개", 2);
		Pet cat = new Cat("냥이", "길고양이", 1);
		
		dog.feed();
		dog.takeNap();
		
		System.out.println("------------------------------");
		
		cat.feed();
		cat.takeNap();
		
		
	}

}
