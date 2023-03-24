package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 스캐너를 통해 id를 입력받습니다.
		 2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높습니다.
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다."출력 후 종료.
		 */
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("id입력: ");
			String id = sc.next().trim();
			
			if(id.replace(" ","").length() < 5) {
				System.out.println("5글자 미만입니다 다시 적어주세요.");
			}
			else {
			System.out.println("id가 등록되었습니다.");
			break;
			}
		sc.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
