package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		System.out.print("정수 3: ");
		int num3 = sc.nextInt();

		int max, mid, min;

		if (num1 > num2 && num1 > num3) {
			max = num1;
			if ( num2 > num3) {
				mid = num2; min = num3;
			}else {
				mid = num3; min = num2;
			}
		}else if (num2 > num1 && num2 > num3) {
			max = num2;
			if ( num1 > num3) {
				mid = num1; min = num3;
			}else {
				mid = num3; min = num1;
			}
		}else {
			max = num3;
			if ( num2 > num1) {
				mid = num2; min = num1;
			}else {
				mid = num1; min = num2;

		}
		}
		System.out.println("-----------------------------");
		System.out.printf("최대값:%d \n중간값:%d \n최소값:%d \n",max, mid, min);
		sc.close();
	}
}
