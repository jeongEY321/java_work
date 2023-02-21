package test;

import java.util.Scanner;

public class TEstTest {

	public static void main(String[] args) {

		/*
	 # 국어, 영어, 수학 점수를 각각 입력받아서
	 평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
	 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
	 95~100 -> A+
	 94~90 -> A0
	 80점대는 B, 70점대는 C, 60점대는 D, 나머지는
	 모두 F 처리하시면 됩니다. (100점이 만점)
		 */

		Scanner sc = new Scanner(System.in);

		double a, b;
		do {
			System.out.print("첫번째 정수를 적어주세요: ");
			a = sc.nextDouble();

			if (0 != (a % 1)) {
				System.out.println("정수가 아닙니다. ");
			}
		} while (0 != (a % 1));

		do {
			System.out.print("두번째 정수를 적어주세요: ");
			b = sc.nextDouble();

			if (0 != (b % 1)) {
				System.out.println("정수가 아닙니다.");
			}
		} while (0 != (b % 1));

		if(a < b) {
			System.out.printf("두번째 정수 %.0f이(가) 큰 수 입니다.", b);
		} else if(a > b) {
			System.out.printf("첫번째 정수 %.0f이(가) 큰 수 입니다.", a);
		} else {
			System.out.println("두 정수는 같습니다.");
		}

		sc.close();





















	}

}
