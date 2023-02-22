package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서
		 평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 95 ~ 100 -> A+
		 90 ~ 94 -> A0
		 80점대는 b, 70점대는 c, 60점대는 d, 나머지는 모두 f
		 처리하시면 됩니다. (100점이 만점)
		 */

		double ko, en, ma, po;

		do {
			System.out.print("국어점수: ");
			ko = sc.nextDouble();
			if(ko > 100 || ko < 0) {
				System.out.println("잘못입력하셨습니다.");
			}
		} while( ko > 100 || ko < 0);

		do {
			System.out.print("영어점수: ");
			en = sc.nextDouble();
			if(en > 100 || en < 0) {
				System.out.println("잘못입력하셨습니다.");
			}
		} while( en > 100 || en < 0);

		do {
			System.out.print("수학점수: ");
			ma = sc.nextDouble();
			if(ma > 100 || ma < 0) {
				System.out.println("잘못입력하셨습니다.");
			}
		} while( ma > 100 || ma < 0);

		po = (ko + en + ma) / 3;

		System.out.println("------------------------");
		System.out.printf("평균 점수: %.1f점\n", po);

		if(po >= 95) {
			System.out.println("당신의 학점은 A+입니다.");
		} else if(po >= 90) {
			System.out.println("당신의 학점은 A0입니다.");
		} else if(po >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if(po >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if(po >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
		}

		sc.close();


	}

}
