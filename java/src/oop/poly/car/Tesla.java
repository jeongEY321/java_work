package oop.poly.car;

public class Tesla extends Car{

	@Override
	void run() {
		System.out.println("테슬라가 터집니다~");
	}

	void enterMembership() {
		System.out.println("테슬라 멤버쉽에 가입합니다.");
	}
	
}
