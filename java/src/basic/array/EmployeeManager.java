package basic.array;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 사원의 정보: 사번, 이름, 나이, 부서명
		 */
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		int count =0; //실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.

		/*
		 신규 등록, 정보 몱록, 정보 수정, 사원 삭제, 프로그램 종료
		 */
		int i=0;


		//		for(int m=0; m<99; m++) {
		//			userNums[m] = String.valueOf(m);
		//			names[m] =String.valueOf(m);
		//			ages[m] = m;
		//			departments[m] = String.valueOf(m);
		//			count++;
		//		}   //99까지 자동 채워주기

		//		System.out.println(count); //카운트 확인용.


		while(true) {
			System.out.println("-------------사원 관리 프로그램-----------");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");


			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();

			if(menu == 1) {
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
				if(count == 100) {
					System.out.println("더이상 신규등록이 불가능합니다.");
					continue;
				}
				out: while(true) {
					boolean flag = false;
					System.out.print("사번: ");
					userNums[i] = sc.next();
					for(int j=0; j<count; j++) {
						if(!userNums[j].equals(userNums[i])) {
							flag = true;
							break;
						}
						if(!flag) {
							System.out.println("중복된 사원번호 입니다. 다시 입력해주세요.");
							continue out;
						}
					}

					System.out.print("이름: ");
					names[i] = sc.next();
					System.out.print("나이: ");
					ages[i] = sc.nextInt();
					System.out.print("부서명: ");
					departments[i] = sc.next();
					System.out.println(names[i] + "님의 정보가 정상 입력 되었습니다.");
					i++;
					count++;
					break;
				}

			} else if (menu == 2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				} for(i =0; i<count; i++) {
					System.out.printf("%d사번: %s 이름: %s 나이: %d 부서명: %s \n"
							, i+1, userNums[i], names[i], ages[i], departments[i]);

				}
				continue;

			} else if (menu == 3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				System.out.print("정보확인 사원번호: ");
				String sa = sc.next();
				for(i=0; i<count; i++) {
					if(!sa.equals(userNums[i])) {
						System.out.println("조회하신 사원의 정보가 없습니다.");
						continue;
					} else {
						System.out.printf("사번: %s 이름: %s 나이: %d 부서명: %s \n"
								, userNums[i], names[i], ages[i], departments[i]);
						continue;
					}

				}

			} else if (menu == 4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				boolean flag = false;
				System.out.print("사원번호를 입력해주세요: ");
				String chan = sc.next();
				for(int k=0; k<count; k++) {
					if(chan.equals(userNums[k])) {
						flag = true;
						System.out.println("1.나이변경 2.부서변경 3.취소");
						System.out.print("> ");
						int chnum = sc.nextInt();

						if(chnum==1) {
							System.out.print("나이: ");
							ages[k] = sc.nextInt();
							break;
						} else if(chnum==2) {
							System.out.print("부서: ");
							departments[k] = sc.next();
							break;
						} else if(chnum==3) {
							System.out.println("취소합니다.");
							break;
						} else {
							System.out.println("1 2 3번중에 골라주세요.");
							break;
						}

					}
				}if(!flag) {
					System.out.println("사번이 존재하지 않습니다.");
					break;
				}
			} else if (menu == 5) {
				//사번을 입력받아서
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.print("사원번호를 입력해주세요: ");
				String de = sc.next();
				boolean flag = false;
				for(int q=0; q<count; q++) {
					if(de.equals(userNums[q])) {
						flag = true;
						System.out.println("정말 삭제하시겠습니까? [Y/N]");
						System.out.print("> ");
						String choi = sc.next();
						if(choi.equals("Y")) {
							for(int w=q; w<count; w++) {
								if(w == userNums.length-1) {
									userNums[w] = null;
									names[w] = null;
									ages[w] = 0;
									departments[w] = null;
									break;
								} else {
									userNums[w]=userNums[w+1];
									names[w]=names[w+1];
									ages[w]=ages[w+1];
									departments[w]=departments[w+1];
								}

							}
							System.out.println("삭제가 정상적으로 진행되었습니다.");
							i--;
							count--;
							continue;

						} else if(choi.equals("N")) {
							System.out.println("취소합니다.");
							break;
						}
					} else {
						System.out.println("Y / N 중 골라주세요.");
					}
				}
				if(!flag) {
					System.out.println("일치하는 사원번호가 없습니다.");
					continue;
				}


			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");

			}


		}// end while true

	} // end main

















}


