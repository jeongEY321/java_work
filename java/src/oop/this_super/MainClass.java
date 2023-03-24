package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.name = "전사1";
		p1.characterInfo();
		
		System.out.println("-----------------------");
		
		Player p2 = new Player("전사2");
		p2.characterInfo();
		
		System.out.println("-----------------------");
		
		Player p3 = new Player("전사3", 100);
		p3.characterInfo();
		
		System.out.println("-----------------------");
		
		Player p4 = new Player("전사3", 150, 2);
		p4.characterInfo();
		
		System.out.println("-----------------------");
		
		p3.attack(p2);
		p1.attack(p2);
		p2.attack(p1);
		
		
		Warrior w1 = new Warrior("광전사");
		w1.characterInfo();
		
		Hunter h1 = new Hunter("광헌터");
		h1.characterInfo();
		
		Mage m1 = new Mage("광법사");
		m1.characterInfo();
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
