package test;

import java.util.Scanner;

public class TestTestTEst {

	public static void main(String[] args) {


		/*
		 문제 : 정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요.
              한 과목이라도 8개 미만인 경우, "불합격입니다!"를 출력하고 총 개수가 60개
              이상이면 "합격입니다!"를 출력하는 프로그램을 만들어보세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("소프트웨어 설계 정답 개수: ");
		int sul = sc.nextInt();
		System.out.print("소프트웨어 개발 정답 개수: ");
		int ge = sc.nextInt();
		System.out.print("데이터베이스 구축 정답 개수: ");
		int gu = sc.nextInt();
		System.out.print("프로그래밍 언어활용 정답 개수: ");
		int un = sc.nextInt();
		System.out.print("정보시스템 구축관리 정답 개수: ");
		int guan = sc.nextInt();

		int ch = sul + ge + gu + un + guan;

		if( 8 > sul || 8 > ge || 8 > gu || 8 > un ||  8 > guan) {
			System.out.println("불합격입니다!!");
		} else if (ch < 60) {
			System.out.println("불합격입니다!");
		} else {
			System.out.println("합격입니다!");
		}sc.close();









	}

}
