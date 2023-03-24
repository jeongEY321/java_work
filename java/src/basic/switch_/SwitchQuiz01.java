package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		  다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		  연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		  연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		  결과를 말씀해 주세요.
		 */

		double num1, num2;
		String a;

		do {
			System.out.print("정수 1: ");
			num1 = sc.nextDouble();
			if(0 != (num1%1)) {
				System.out.println("정수를 적어주세요: ");
			}}while(0 != (num1%1));

		System.out.print("연산을 선택하세요 [+, -, *, /]: ");
		a = sc.next();

		do {
			System.out.print("정수 2: ");
			num2 = sc.nextDouble();
			if(0 != (num2%1)) {
				System.out.println("정수를 적어주세요: ");
			}}while(0 != (num2%1));

		switch(a) {
		case "+":
			System.out.printf("%.0f + %.0f = %.0f 입니다.\n", num1, num2, num1+num2); break;
		case "-":
			System.out.printf("%.0f - %.0f = %.0f 입니다.\n", num1, num2, num1-num2); break;
		case "*":
			System.out.printf("%.0f * %.0f = %.0f 입니다.\n", num1, num2, num1*num2); break;
		case "/":
			if(num2 == 0) {
				System.out.println("연산할 수 없는 입력값입니다.");
				break;
			}
			System.out.printf("%.0f / %.0f = %.2f 입니다.\n", num1, num2, num1/num2); break;
		default:
			System.out.println("연산자를 [+, -, *, /]중에 적어주세요"); break;
		}
		sc.close();
	}








}



