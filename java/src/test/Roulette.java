package test;


import java.util.Arrays;
import java.util.Scanner;

public class Roulette {

	public static void main(String[] args) {

		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 인원을 정해주세요(2~4): ");
		int num = sc.nextInt();

		if(num < 2 || num > 4) {
			System.out.println("게임 인원이 올바르지 않습니다. 게임을 종료합니다.");
			sc.close();
			return; // main 함수 종료.
		}

		//플레이어 이름 등록하고
		//배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 게임 참가자의 명수와 동일합니다.
		String[] numb = new String[num];


		for(int i=0; i<numb.length; i++) {
			System.out.print("플레이어 이름: ");
			numb[i] = sc.next();

			System.out.printf("%d번 플레이어: %s\n", i+1, numb[i]);
		}
		System.out.println(Arrays.toString(numb));



		//실탄 개수 입력(1미만이면 안되고, 5초과도 안됩니다.)
		//실탄을 탄창에 배치합니다.
		//난수를 생성하셔서 실탄을 탄창에 배치합니다.
		//false -> true로 바꾸는 것이 실탄 장전입니다.
		//난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		//같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		System.out.printf("실탄 개수(1~%d): ", numb.length-1);
		int count = sc.nextInt();

		if(count < 1 || count >= numb.length) {
			System.out.println("실탄 수가 올바르지 않습니다. 게임을 종료합니다.");
			sc.close();
			return;
		}

		boolean[] bulletPos = new boolean[6];
		for(int i =0; i<count; i++) {

			int a	= (int) (Math.random()*5);
			if(bulletPos[a]==true) {
				i--;
				continue;
			} else {
				bulletPos[a] = true;
			}
		}//총알배치 끝

		/* 선생님 방법
		 int checkNum =0;
		 while(checkNum < count) {
		 int position = Math.random()*bulletPos.length;
		 if(bulletPos[position]) {
		 continue;
		 } else {
		 bulletPOs[position]=true;
		 checkNum++;
		 }
		 }
		 */


		//실행 순서 정하기
		//난수를 이용하여 실행 순서를 정합니다.
		//시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관없습니다.

		int startnum = (int) (Math.random()*numb.length);
		System.out.println(numb[startnum] + "님부터 시작합니다.");

		//일부로 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		//따로 변수를 선언하지 않습니다.
		sc.nextLine();



		//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.
		int realBulletPos = 0;

		while(true) {


			System.out.printf("\n\n[%s님의 턴입니다.]\n", numb[startnum]);
			System.out.println("'ENTER'을(를)누르시면 격발합니다.");
			sc.nextLine();

			if(bulletPos[realBulletPos]) { //총알 격발!
				System.out.printf("\n빵!!!\n[%s]님이 죽으셨습니다.\n", numb[startnum]);
				count--;
				num--;
				bulletPos[realBulletPos] = false; //총알이 소모되었으니 false로 변경.

				//지금 죽은 사람 기준으로 뒤에 있는 값을 한칸씩 땡기는 작업.
				for(int i=startnum; i<numb.length-1; i++) {
					numb[i] = numb[i+1];
				}

				String[] temp = new String[numb.length-1];

				for(int j=0; j<temp.length; j++) {
					temp[j] = numb[j];
				}
				numb = temp; temp = null;

				System.out.println("생존인원: " + Arrays.toString(numb));

				if(numb.length == 1) {
					System.out.println("최종 생존자: " + numb[0]);
					System.out.println("게임을 종료합니다.");
					break;
				} else if(count == 0) {
					System.out.println("총알이 다 떨어졌습니다.");
					System.out.println("최종 생존자: " + Arrays.toString(numb));
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("남은 인원이 게임을 재개합니다.");
					sc.nextLine();
				}

			} else { // false였기 때문에 생존.
				System.out.println("생존하셨습니다.");
				startnum++;
			}
			//플레이어가 생존할 때마다 startnum의 값을 하나씩 올리고 있는데
			//맨 마지막 사람까지 생존했을 경우에는 다음 차례가 첫번째 사람이기 때문에
			//인덱스를 0으로 바꿔서 배열 맨 앞사람이 순서를 가질 수 있도록 처리.
			if(startnum == num) {
				startnum = 0;
			}

			realBulletPos++;

		}//while문 end
		sc.close();
	}

}
