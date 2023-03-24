package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사1");
		Mage m1 = new Mage("법사1");
		Hunter h1 = new Hunter("사냥꾼1");
		Warrior w2 = new Warrior("전사2");
		
		w1.rush(m1);
		w1.rush(h1);
		w2.rush(w1);
		w2.rush(w1);
		
		
		
		
		
		
		
		
		
		
	}

}
