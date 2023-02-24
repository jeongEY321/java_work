package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {


		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		 사용자가 0을 입력하면 종료하게만들기.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("연산퀴즈 정답을 맞추세요.");
		System.out.println("0을 입력하시면 퀴즈가 종료됩니다.");
		int a=0, b=0;
		while(true) {
			int num1 = (int) ((Math.random()*100)+1);
			int num2 = (int) ((Math.random()*100)+1);
			int tru = (int) ((Math.random()*2)+1);

			if (tru == 1) {
				System.out.printf("%d+%d= ", num1, num2);
				int answ = sc.nextInt();
				if(answ == 0) break;
				if(answ == num1 + num2) {
					System.out.println("정답입니다.");
					a++;
				} else {
					System.out.println("오답입니다."); 
					b++;
				}}else {
					System.out.printf("%d-%d= ", num1, num2);
					int answ = sc.nextInt();
					if(answ == 0) break;
					if(answ == num1 - num2) {
						System.out.println("정답입니다.");
						a++;
					} else {
						System.out.println("오답입니다.");
						b++;
					}}} System.out.println("---------------");
					System.out.printf("정답 횟수: %d회\n오답 횟수: %d\n", a, b);
					sc.close();
	}

}
