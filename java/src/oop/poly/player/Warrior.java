package oop.poly.player;

public class Warrior extends Player {

	int rage;

	Warrior(String name) {
		super(name);
		this.rage = 60;
	}
	/*
		 - 전사의 고유 기능인 rush 메서드를 작성합니다.
		 
		 - rush의 대상은 모든 직업들 입니다.
		 
		 - 만약 rush의 대상이 전사라면 10의 피해를 받고,
		  마법사라면 20의피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
		  
		 - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
		 
		 - 남은 체력도 출력해 주세요.
		 
		 - main에서 객체를 생성한 후 호출하여 잘 적용됐는지 확인해 주세요.
	 */
	
	public void rush(Player p) {
		System.out.println(this.name + "(이)가 " + p.name + "에게 돌진은 시전합니다.");
		if(p instanceof Warrior) {
			p.hp -= 10;
		} else if(p instanceof Mage) {
			p.hp -= 20;
		} else if(p instanceof Hunter) {
			p.hp -= 15;
		}
		System.out.println(p.name + "의 체력: " + p.hp);
		System.out.println("---------------------------------");
		
		
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
		
		System.out.println("------------------------------");
	}












}
