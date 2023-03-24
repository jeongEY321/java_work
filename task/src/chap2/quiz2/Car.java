package chap2.quiz2;

public class Car {
	String model;
	int speed;
	char mode;
	boolean start;

	public Car(String a) {}

	void setSpeed(int speed) {
		if(speed <0 || speed > 200) {
			System.out.println("속도는 0미만, 200 이상일 수 없습니다.");
		}else if(start == false) {
			System.out.println("시동이 걸려있지 않은 상태에서 속도를 지정할 수 없습니다.");
		}else if(mode != 'D' && mode != 'R') {
			System.out.println("속도를 지정할 수 없습니다.");
		}else if(mode == 'R') {
			if(speed > 40) {
				System.out.println("R모드는 속도를 40 초과해서 지정할 수 없습니다.");
			}
		}
		this.speed = speed;
	}
	int getSpeed() {
		return this.speed;
	}
	
	
	void setMode(char mode) {
		if(mode != 'R' || mode != 'N' || mode != 'P' || mode != 'D') {
			this.mode = 'p';
		}
		this.mode = mode;
	}
	char getMode() {
		return this.mode;
	}
	
	void engineStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		injectGasoline();
		injectoil();
		this.start = true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	
	void injectGasoline() {
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	
	void injectoil() {
		System.out.println("엔진오일이 순환합니다.");
	}
	
	void moveCylinder () {
		if(this.start = true) {
			System.out.println("실린더가 움직입니다.");
		}
		else {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}

	void engineStop() {
		if(speed > 0 ) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
		}
		else if (speed == 0) {
			if(mode != 'P') {
				System.out.println("P모드로 먼저 변속기를 변경하세요.");
			}
			else {
				start = false;
			System.out.println("시동이 꺼졌습니다.");
			}
			}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}










































