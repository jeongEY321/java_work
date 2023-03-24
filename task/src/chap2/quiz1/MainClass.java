package chap2.quiz1;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 30;
		s1.studentId = "a001";
		s1.info();
		
		Teacher t1 = new Teacher();
		t1.name = "김철수";
		t1.age = 50;
		t1.subject = "수학";
		t1.info();
		
		Employee d1 = new Employee();
		d1.name = "박영희";
		d1.age = 25;
		d1.departments = "영업부";
		d1.info();
	}

}
