package chap2.quiz1;

public class Employee extends Person{
String departments;

@Override
void info() {
	super.info();
	
	System.out.println("부서: " + departments);
}



}
