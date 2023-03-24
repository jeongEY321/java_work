package basic.if_;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
		 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수 : 4, 7 -> 7이 큰 수 입니다.
		 입력받은 수 : 10, 3 -> 10이 큰 수 입니다.
		 입력받은 수 : 5, 5 -> 같은 수 입니다.
		 */
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 정수를 적어주세요: ");
		int a = sc.nextInt();
	
		
		System.out.print("두번째 정수를 적어주세요: ");
		int b = sc.nextInt();
		
		if(a < b) {
			System.out.printf("두번째 정수 %d이(가) 큰 수 입니다.", b);
		} else if(a > b) {
			System.out.printf("첫번째 정수 %d이(가) 큰 수 입니다.", a);
		} else {
			System.out.println("두 정수는 같습니다.");
		}
		
		sc.close();
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
