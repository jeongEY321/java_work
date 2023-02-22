package basic.if_;

import java.net.MulticastSocket;
import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
	/*
	 키와 나이를 입력받아서 사용자가 놀이기구에 탑승 할 수 있는지의 여부를
	 판단 하면 된다.
	 키 140cm 이상, 나이가 8세 이상인 사용자만
	 놀이기구 탑승이 가능하다고 가정하고, 판단할 수 있는 로직을 작성하세요.
	 하나의 조건이라도 만족하지 못한다면 탑승이 불가능합니다.
	 
	 놀이기구 탑승 여부와 관계없이 "오늘 하루 즐거운 시간 되세요"
	 를 출력하세요.
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요: ");
		double ta = sc.nextDouble();
		
		System.out.printf("나이:%d \n키:%.1f\n", age, ta);
		
		System.out.println("-----------------------");
		
		if (age >= 8 && ta >= 140.0) {
			System.out.println("탑승 가능합니다.");
		}
		
		else if (age < 8 && ta < 140.0) {
			System.out.printf("%d세 미만,%.1f cm미만은 탑승하실 수 없습니다.\n", age, ta);
		}
		
		
//		else {
//			System.out.println("탑승 불가능합니다.");
//		}
		
	
		
		
		
		else if (age < 8) {
			System.out.println("8세 미만은 탑승하실 수 없습니다.");
		}
		
		else if (ta < 140) {
			System.out.println("키 140cm미만은 탑승하실 수 없습니다.");
		}
		
		
		System.out.println("오늘 하루 즐거운 시간 되세요.");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
