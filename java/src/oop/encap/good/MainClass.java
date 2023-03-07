package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		
//		my.year = 1999; (x)
		my.setYear(1999);
		my.setMonth(2);
		my.setDay(4);
		
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", my.getYear("abc1234"), my.getMonth(), my.getDay());
		
		/*
	     - month와 day의 setter / getter 메서드를 선언하세요.
	     - month: 1 ~ 12
	     - day: 1 ~ 31
	     - getter 메서드는 따로 비밀번호 등 권한 검사 없이
	      바로 return 속성값 해 주세요.
	     */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
