package oop.obj_arr;

public class Score {
	
	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	private String name;
	private int ko;
	private int en;
	private int me;
	private int tot;
	private double aver;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getMe() {
		return me;
	}
	public void setMe(int me) {
		this.me = me;
	}
	public int getTot() {
		tot = ko + en + me;
		return tot;
	}
	public double getAver() {
		aver = (ko + en + me)/3.0;
		return aver;
	}


	public void scoreInfo() {
		System.out.println("이름: " + name);
		System.out.println("국어: " + ko + "점");
		System.out.println("영어: " + en + "점");
		System.out.println("수학: " + me + "점");
		System.out.println("총점: " + getTot() + "점");
		System.out.println("평균: " + getAver() + "점");
	}
}
