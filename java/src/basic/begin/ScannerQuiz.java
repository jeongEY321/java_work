package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		/*
		 - 스캐너를 사용하여 이름과 나이를 입력받아서
		 
		 이름: xxx
		 나이: xxx
		 출생년도: xxxx년
		 
		 을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고
		 출생년도는 입력사항이 아닙니다.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요  ");
		String name = sc.next();
//		System.out.println(name);
				
		System.out.print("나이를 입력하세요  ");		
		int age = sc.nextInt();
//		System.out.println(age);
		
		int agee = 2023 - age;
		System.out.printf("이름: %s \n나이: %d세 \n출생년도: %d년 ", name, age, agee);
		
		sc.close();
		
		
		
		
		
	}

}
