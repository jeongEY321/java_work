package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {

	public static String solution(String[] participant, String[] completion) {

		/*
         - 참가한 사람의 이름이 담긴 배열 participant와
         완주한 사람의 이름이 담긴 배열 completion이 주어질 때
         완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
		 */
		int i=0;
		Arrays.sort(completion);
		Arrays.sort(participant);
		for(i=0; i < participant.length; i++) {
			int a = Arrays.binarySearch(completion, participant[i]);
			if(a < 0){
				break;
			}
		}
		return participant[i];
	}

	public static void main(String[] args) {

		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"홍길동", "김길동", "김철수", "박영희"};

		System.out.println("미완주 선수: " + solution(participant, completion));

		
		
		
		
		
		
		
		
		
	}

}
