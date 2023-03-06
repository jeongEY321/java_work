package oop.this_super;

public class Mage extends Player {
	int mana;

	Mage(String name) {
		super(name);
		this.mana = 150;
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 마나: " + mana);

		System.out.println("------------------------------");

	}




}
