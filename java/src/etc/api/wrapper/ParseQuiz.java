package etc.api.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		out : while(true) {
			System.out.print("주민등록번호를 입력하세요 (-를 포함하여 작성): ");
			String resident = sc.next();
			resident.split(" ");
			String c = resident.substring(7,8);

			if(resident.length() != 14) {
				System.out.println("13자리 혹은 '-'를 포함하였는지 확인해주세요."); continue;
			} else if(!resident.substring(6,7).equals("-")) {
				System.out.println("-를 포함하여 작성해주세요"); continue;
			} else if(!c.equals("1") && !c.equals("2") && !c.equals("3") && !c.equals("4")) {
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다."); continue;
			}

			if(c.equals("1") || c.equals("2")) {
				String year = resident.substring(0,2);
				System.out.printf("19%s년 %s월 %s일 ",year,
						resident.substring(2,4), resident.substring(4,6));
				int year1 = Integer.parseInt(year);
				System.out.print("나이:" + (2023-(year1+1900)) + "세 ");
				if(c.equals("1")) {
					System.out.println("남자");
				}else System.out.println("여자"); break out;

			}if(c.equals("3") || c.equals("4")) {
				String year3 = resident.substring(0,2);
				System.out.printf("20%s년 %s월 %s일 ",year3, 
						resident.substring(2,4), resident.substring(4,6));
				int year4 = Integer.parseInt(year3);
				System.out.print("나이:" + (2023-(year4+2000)) + "세 ");
				if(c.equals("3")) {
					System.out.println("남자");
				}else System.out.println("여자"); break out;
			}
		}
		sc.close();


	}
}
