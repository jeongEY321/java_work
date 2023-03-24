package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		int [][] score = {
				{89, 80, 99}, //a학생
				{95, 85, 89}, //b학생
				{90, 65, 56}, //c학생
				{69, 78, 77}  //d학생
				//과목: 3개
		};
		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};

		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
		 2. 각 과목을 평균을 출력해 보세요.
		 3. 반 평균을 출력해보세요.(모든 학생들의 평균을 더해서 학생수로 나누기)
		 */

		int idx = 0; //stuName 배열에서 학생으 ㅣ이름을 꺼내올 용도로 사요할 변수.
		double totalAvg = 0.0; //학생들의 평균점수의 총합
		for(int[] stu : score) {
			int total = 0;
			for(int s : stu) {
				total += s;
			}
			double avg = (double) total/subName.length;
			totalAvg += avg;
			System.out.printf("%s 평균: %.1f점\n", stuName[idx], avg);
			idx++;
		}System.out.println("-----------------");
		double classAvg = totalAvg/stuName.length;
		System.out.printf("우리반 평균: %.1f점\n", classAvg);
		System.out.println("-----------------");
		
		for(int i = 0; i<subName.length; i++) {
			int total = 0;
			for(int j = 0; j<stuName.length; j++) {
				total += score[j][i];
			}
			double a = (double)total / stuName.length;
			System.out.printf("%s 평균: %.1f점\n", subName[i], a);
			
		}
		
		}
		

		
		
		
		
		
		
		
		
		
}
	
