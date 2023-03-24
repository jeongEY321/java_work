package test;

import java.util.Scanner;

public class SwitchQuiz01Plus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		
		System.out.print("연산을 선택하세요 [+,-,*,/]: ");
		String operator = sc.next();
		
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		int result = 0;
		boolean flag = true;
		
		switch(operator) {
		
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("연산할 수 없는 입력값입니다.");
				flag = false;
				break;
			}
			result = num1 / num2;
			break;
		default:
			System.out.println("사칙연산 기호를 정확하게 입력하세요.");
			System.out.println("[+,-,*,/]");
			flag = false;
		
		}
		
		if(flag) {
			System.out.printf("%d %s %d = %d\n", num1, operator, num2, result);			
		sc.close();
		}
	}

}
