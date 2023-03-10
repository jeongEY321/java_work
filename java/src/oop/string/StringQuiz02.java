package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호는 -을 포함해서 받을 예정입니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("'-'를 포함하여 적어주세요.");
		out: while(true) {
			System.out.print("주민등록번호: ");
			String num = sc.next().trim();
			String nums = num.replace("-", "");
			if(nums.length() != 13 || !num.substring(6, 7).equals("-") ) {
				System.out.println("잘못적으셨습니다. 다시 적어주세요");
			}
			else {
				if(nums.substring(6, 7).equals("1") || nums.substring(6, 7).equals("3")) {
					System.out.println("남자입니다."); break out;
				}else if(nums.substring(6, 7).equals("2") || nums.substring(6, 7).equals("4")){
					System.out.println("여자입니다."); break out;
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
				
			}
		}





		sc.close();


	}

}
