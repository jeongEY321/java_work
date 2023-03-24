package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		/*
		 사용자에게 섭씨온도를 입력받아서
		 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		화씨 온도는 소수점 첫째 자리까지 표현해 주세요.
		# ㄹ 한자 7 -> (℃), ㄹ 한자 다음장 4 -> (℉)
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("현재 섭씨 온도를 적어주세요: ");
		double a = sc.nextDouble();
		double b = (a * 9 / 5) + 32;
		
		
		System.out.printf("현재 썹씨온도: %.1f℃ \n변환한 화씨온도: %.1f℉", a, b);
		
		sc.close();
		
		
		
		
	}

}
