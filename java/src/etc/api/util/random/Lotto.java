package etc.api.util.random;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] lotto = new int[6];
		int[] playL = new int[6];
		int lottoP = r.nextInt(45)+1;
		int playLP = 0;

		int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
		int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
		int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
		int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
		int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
		int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수
		long countCash = 0;


			for(int i = 0; i < lotto.length; i++) { //로또 번호 생성기.
				lotto[i] = r.nextInt(45)+1;
				for(int k = 0; k < i; k++) {
					if(lottoP == lotto[i]) { i--; continue;
					} else if (lotto[i] == lotto[k]) { i--; continue;
					}
				}
			}//로또 번호 생성.
			while(true) {
				System.out.println((countCash+1) + "번째 로또");
			for(int i = 0; i < lotto.length; i++) { //자동 로또 번호 생성기.
				playL[i] = r.nextInt(45)+1;
				for(int k = 0; k < i; k++) {
					if (playL[i] == playL[k]) {
						i--; continue;
					}
				}
			}//자동 번호 만들기 끝.
			out: while (true) {
				playLP = r.nextInt(45)+1;
				for(int i = 0; i < lotto.length; i++) {
					if(playLP == playL[i]) {
						continue out;
					}
				}
				break;
			}

			//번호 확인 후 등수 체크
			int count = 0;
			for(int i = 0; i < lotto.length; i++) {
				for(int k = 0; k < lotto.length; k++) {
					if(lotto[i] == playL[k]) {
						count++;
					}
				}
			}
			if(count == 6) {
				System.out.println("1등 당첨입니다.");
				prize1++;
				break;
			} if(count == 5) {
				if(lottoP == playLP) {
					System.out.println("2등 당첨입니다.");
					prize2++;
				} else {
					System.out.println("3등 당첨입니다.");
					prize3++;
				}
			} if(count == 4) {
				System.out.println("4등 당첨입니다.");
				prize4++;
			} if(count == 3) {
				System.out.println("5등 당첨입니다.");
				prize5++;
			} if(count < 3) {
				System.out.println("꽝 입니다.");
				failCnt++;
			}
			countCash++;
		}//첫while문 끝 / 몇등 몇면, 로또 구매금액
			System.out.println("---------------------------------------");
			System.out.println("1등 당첨 횟수:   \t" + prize1);
			System.out.println("누적 2등 당첨 횟수: \t" + prize2);
			System.out.println("누적 3등 당첨 횟수: \t" + prize3);
			System.out.println("누적 4등 당첨 횟수: \t" + prize4);
			System.out.println("누적 5등 당첨 횟수: \t" + prize5);
			System.out.println("누적 꽝 당첨 횟수:  \t" + failCnt);
			System.out.println("구매 횟수: " + countCash);
			System.out.println("누적 구매 금액:   \t" + countCash*0.1 + "만원");
	}

}
