package basic.loop;

import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		
		/*
		 # 사용자에게 구구단 단수를 입력받아서
		 해당 단수의 구구단을 출력해 보세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 입력하세요: ");
		int num = sc.nextInt();
		int numm = 1;
		
		while(numm <= 9) {
			System.out.printf("%dX%d=%d\n", num, numm, num*numm);
			numm++;
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
