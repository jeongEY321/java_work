package chap5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodManager {

	public static void main(String[] args) {

		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");

		out: while(true) {

			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();

			System.out.println("--------------------------------");

			if(menu == 1) {
				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */
				System.out.print("# 등록할 메뉴: ");
				String me = sc.next();
				if(foods.containsKey(me)) {
					System.out.println("이미 존재하는 메뉴입니다.");
				} else {
					System.out.print("# 메뉴 가격설정: ");
					int price = sc.nextInt();
					foods.put(me, price);
					System.out.println("'"+ me + "'메뉴가 등록되었습니다.");
				}
			} else if(menu == 2) {
				/*
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 

				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....

				  메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.

				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.

				  - 취소: 메인 메뉴로 이동
				 */
				if(foods.size()==0) {
					System.out.println("메뉴를 먼저 등록해 주세요!");
				} else {
					Set<String> name = foods.keySet();
					for(String n : name) {
						System.out.println(n + " : " + foods.get(n));
					}
					System.out.printf("--------------------------------\n(1. 수정 | 2. 삭제 | 3. 취소)\n");
					System.out.print("> ");
					int num = sc.nextInt();
					if(num == 1) {
						System.out.print("수정할 메뉴: ");
						String CName = sc.next();
						if(!foods.containsKey(CName)) {
							System.out.println("없는 메뉴입니다.");
							break;
						} else {
							System.out.print("수정할 가격: ");
							int NPrice = sc.nextInt();
							foods.put(CName, NPrice);
							System.out.println("수정이 완료되었습니다.");
						}

					} else if (num==2) {
						System.out.print("삭제할 메뉴: ");
						String CName = sc.next();
						if(!foods.containsKey(CName)) {
							System.out.println("없는 메뉴입니다.");
							break;
						} else {
							foods.remove(CName);
							System.out.println("삭제 완료되었습니다.");
						}
					} else if (num==3) {
						System.out.println("취소합니다.");
					} else {
						System.out.println("잘못된 번호입니다.");
					}

				}


			} else if(menu == 3) {
				/*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				System.out.print("프로그램을 종료합니다. Y / N : ");
				String yn = sc.next();
				if(yn.equals("Y")) {
					System.out.println("프로그램 종료합니다.");
					sc.close();
					break out;
				} else if (yn.equals("N")) {
					System.out.println("프로그램 종료가 취소되었습니다.");
				} else {
					System.out.println("Y / N 중 혹은 대문자로 적어주세요");
				}

			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}



		}



	}

}

