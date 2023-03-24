package oop.constructor;

public class Person {
	String name;
	int age;
	int he;
	
	Person() {
		
	}
	
	Person(String pName, int pAge, int pHe) {
		name = pName;
		age = pAge;
		he = pHe;
	}
	
	void info() {
		System.out.println("*** 회원정보 ***");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + he);
		
	}
	
	
}










