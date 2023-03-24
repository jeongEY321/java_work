package chap2.quiz1;

public class Student extends Person {
String studentId;

@Override
void info() {
	super.info();
	
	System.out.println("학번: " + studentId);
}







}
