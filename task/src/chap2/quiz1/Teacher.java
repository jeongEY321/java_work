package chap2.quiz1;

public class Teacher extends Person{
String subject;

@Override
void info() {
	super.info();
	
	System.out.println("과목: " + subject);
}



}
