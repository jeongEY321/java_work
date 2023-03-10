package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

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

		//플레이어 이름 등록하고
		//배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 게임 참가자의 명수와 동일합니다.
		String[] numb = new String[num];


		for(int i=0; i<numb.length; i++) {
			System.out.print("플레이어 이름: ");
			numb[i] = sc.next();

			System.out.printf("%d번 플레이어: %s\n", i+1, numb[i]);
		}


		//실탄 개수 입력(1미만이면 안되고, 5초과도 안됩니다.)
		//실탄을 탄창에 배치합니다.
		//난수를 생성하셔서 실탄을 탄창에 배치합니다.
		//false -> true로 바꾸는 것이 실탄 장전입니다.
		//난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		//같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		System.out.print("실탄 개수(1~"+ (num-1) +"): ");
		int count = sc.nextInt();

		boolean[] bulletPos = new boolean[6];
		out: for(int i =0; i<count; i++) {

			int a	= (int) (Math.random()*5);
			if(bulletPos[a]==true) {
				i--;
				continue out;
			}
			bulletPos[a] = true;
		}
		//실행 순서 정하기
		//난수를 이용하여 실행 순서를 정합니다.
		//시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관없습니다.

		int startnum = (int) (Math.random()*numb.length);
		System.out.println(numb[startnum] + "님부터 시작합니다.");

		//일부로 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		//따로 변수를 선언하지 않습니다.



		//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.
		sc.nextLine();

		int realBulletPos = 0;

		while(true) {

			System.out.printf("\n%d님의 턴!\n탄창을 재장전합니다.\n", numb[startnum]);
			System.out.println("'ENTER'을(를)누르시면 격발합니다.");
			sc.nextLine();


			if(bulletPos[realBulletPos]) {
				System.out.printf("\n빵!!\n%d님은 죽으셨습니다.\n", numb[startnum]);
				count--;
				num--;
				bulletPos[realBulletPos] = false;

				for(int i=startnum; i<numb.length; i++) {
					numb[i] = numb[i+1];
				}
				String[]temp = new String[numb.length-1];
				for(int j=0; j<numb.length-1; j++) {
					temp[j] = numb[j];
				}
				numb = temp; temp = null;

				System.out.println("생존인원: " + Arrays.toString(numb));

				if(numb.length == 1) {
					System.out.println("최종우승자는" + numb[0] + "입니다.");
				} else if(count ==0) {
					System.out.println("남은인원 모두 살아남았습니다.");
					System.out.println("남은 인원: " + Arrays.toString(numb));
				} else {
					System.out.println("게임을 재개합니다.");
					sc.nextLine();
				}

			} else {
				System.out.println("휴.. 살아남았습니다.");
				startnum++;
			}
			if(startnum == num) {
				startnum = 0;
			}
			realBulletPos++;

			sc.close();
		}//while문 end





		


	}

}
