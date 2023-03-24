package basic.loop;

import java.util.Scanner;

public class WhileQuiz04 {

	public static void main(String[] args) {

		//입력받은 수의 약수의 종합을 구하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해주세요: ");
		int a = sc.nextInt();
		int b = 1;
		int to = 0;	
		while(b <= a) {
			if(a%b==0) {
				to += b;
			}

			b++;
		}
		System.out.printf("%d의 약수의 종합: %d\n",a, to);

		sc.close();














	}

}
