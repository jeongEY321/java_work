package oop.poly.player;

public class Player {
	String name;
	int level;
	int atk;
	int hp;
	
	Player() {
		level = 1;
		atk = 3;
		hp = 50;
		
	}
	
	Player(String name) {
		this(); //같은 클래스의 다른 생성자를 호출하는 문법.
		this.name = name;
	}
	
	Player(String name, int hp) {
		this(name);
		this.hp = hp;
	}
	
	Player(String name, int hp, int level) {
		this(name, hp); //반드시 생성자 내에서 최상단에 위치해야 한다.
		this.level = level;
	}
	
	
	void attack(Player target) {

		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			
			System.out.println("------------------------------");
			return;
		}
		
		System.out.printf("%s(이)가 %s(을)를 공격합니다.\n", this.name, target.name);
		
		target.hp -= 10;
		this.hp += 5;
		System.out.printf("나의 체력: %d\n상대방 체력: %d\n", this.hp, target.hp);
		
		System.out.println("------------------------------");
		
		
		
	}
	
	
	
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
	
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
