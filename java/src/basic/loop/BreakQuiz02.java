package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {

		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
		 */
		Scanner sc = new Scanner(System.in);

		//		int ran = (int) ((Math.random()*100)+1);
		//		System.out.println("UP DOWN START");
		//		int cou=0;//횟수
		//		int g =6;//몇번시도했는지
		//		while(true) {
		//			if(g<0) {
		//				if(g < 0) {
		//					System.out.println();
		//				} else {
		//					System.out.println("정답 기회 모두 소진! \n마저 정답을 맞춰주세요.");
		//				}}
		//			System.out.print("> ");
		//			int ans = sc.nextInt();
		//
		//			if(ran == ans) {
		//				System.out.println("정답입니다.");
		//				cou++; break;
		//			} else if(ran < ans) {
		//				System.out.println("DOUN");
		//				if(g < 0) {
		//					
		//				} else {
		//					System.out.printf("정답 기회 %d번 남음!",g);
		//					g--;
		//					if(g == 0) {
		//						System.out.println();
		//					}
		//					cou++;
		//				}} else {
		//					System.out.println("UP");
		//					if(g < 0) {
		//						
		//					} else {
		//						System.out.printf("정답 기회 %d번 남음!",g);
		//						g--;
		//						if(g == 0) {
		//							System.out.println();
		//						}
		//						cou++;
		//					}}}
		//		if(cou <=7) {
		//			System.out.printf("%d번만에 맞추어 승리하셨습니다.\n", cou);
		//
		//		} else {
		//			System.out.printf("%d번만에 맞추어 패배하셨습니다.\n", cou);
		//		}

		System.out.println("*** UP & DOWN 게임 ***");
		System.out.println("# 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요?");

		int secret = (int) ((Math.random()*100) + 1);
		int count = 0;

		while(true) {
			System.out.print("> ");
			int answer = sc.nextInt();
			count++;

			if(answer<1 || answer>100) {
				System.out.println("범위 내의 숫자를 입력하세요.");
				continue;
			}

			if(answer > secret) {
				System.out.println("DOWN!!!");
			} else if(answer < secret) {
				System.out.println("UP!!!");
			} else {
				System.out.println("정답입니다!");
				break;
			}

			if(count < 7) {
				System.out.println("정답 기회 " + (7-count) + "번 남음!");
			} else {
				System.out.println("정답 기회 모두 소진!");
				System.out.println("마저 정답을 맞춰주세요~");
			}

		}

		System.out.println(count + "번 만에 맞추셨네요~");
		if(count <= 7) {
			System.out.println("승리했습니다!");
		} else {
			System.out.println("패배했습니다 ㅠㅠ");
		}



		sc.close();











	}

}
