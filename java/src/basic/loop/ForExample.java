package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		/*
		int i = 1;
		int tot = 0;

		while(i <= 10) {
			tot += i;
			i++;
		}
		 */
		int tot = 0;

		for(int i=1; i<=10; i++) {
			tot += i;
		}System.out.println(tot);

		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌수를 가로로 출력해보세요.
		System.out.println("---------------------------");
		for(int k=1; k<=200; k++) {
			if(k%6==0 && k%12!=0) {
				System.out.print(k + " ");
			}
		}
		System.out.println("");
		System.out.println("--------------------------------");
		//1~6만 까지의 정수 중 177의 배수의 개수를 구해보세요.
		int g=0;
		for(int h=1; h<=60000; h++) {
			if(h%177==0) {
				g++;
			}
		}System.out.printf("%d 개\n", g);
		System.out.println("-------------------------------");
		//입력을 받은 정수까지의 팩토리얼 값을 구하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		int tota=1;

		for(int a=1; a<=num; a++) {
			tota *= a;
		}System.out.println(tota);

		sc.close();	
	}


}



























































