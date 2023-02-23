package basic.loop;

import java.util.Scanner;

public class WhileExample03 {

	public static void main(String[] args) {
		
		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		 인지를 판별하시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num1 = sc.nextInt();
		int num2=1;
		int c=0;
		
	
		while(num1 >= num2) {
			if(num1%num2==0) {
				c++;
			}
			
			num2++;
		}
		System.out.println(c == 2 ? "소수입니다." : "소수가 아닙니다.");
		
		
		
		System.out.println("----------------------------------");
		
		int j = 2;
		
		while(num1 % j != 0) {
			
			j++;
		}
		System.out.println(num1 == j ? "소수입니다." : "소수가 아닙니다.");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
