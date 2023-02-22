package test;

import java.util.Scanner;

public class TTttttest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		double num1, num2;
		String a;
		do {
			System.out.print("정수 1: ");
			num1 = sc.nextDouble();
			if(0 != (num1%1)) {
				System.out.println("정수를 적어주세요: ");
			}}while(0 != (num1%1));

		do {
			System.out.print("연산을 선택하세요 [+, -, *, /]: ");
			a = sc.next();
			if(!a.equals("+") && !a.equals("-") && !a.equals("*") && !a.equals("/")) {
				System.out.println("연산자를 [+, -, *, /]중에 적어주세요");
			}
		}while(!a.equals("+") && !a.equals("-") && !a.equals("*") && !a.equals("/"));

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

