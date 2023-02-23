package basic.loop;

public class ForQuiz02 {

	public static void main(String[] args) {

		/*
        1. 구구단을 다음과 같이 가로로 출력해 보세요.

        2단: 2x1=2 2x2=4 2x3=6 .....
        3단: 3x1=3 3x2=6 3x3=9 .....
        4단: 4x1=4 4x2=8 4x3=12 .....

        2. 구구단을 다음과 같이 세로로 출력해 보세요.
        각 단의 간격은 탭 하나로 고정하겠습니다.
        2단         3단
        2x1=2      3x1=3
        2x2=4      3x2=6
        2x3=6      3x3=9
        .
        .
        .
		 */
		int dan, hang;

		for(dan=2; dan<=9; dan++) {
			System.out.println("");
			System.out.printf("%d단:  ", dan);
			for(hang=1; hang<=9; hang++) {
				int j = dan*hang;
				if(j <10) {
					System.out.printf("%dX%d=%d   ", dan, hang, j);
				}else {
					System.out.printf("%dX%d=%d  ", dan, hang, j);
				}}
		}
		System.out.println("\n---------------------------------------------------------------------------");
		int dann, hangg;
		for(int i=2; i<=9; i++) {
			System.out.printf("%d단 \t",i);
		}System.out.println("");
		for(hangg=1; hangg<=9; hangg++) {
			for(dann=2; dann<=9; dann++) {
				System.out.printf("%dX%d=%d \t", dann, hangg, dann*hangg);
			}
			System.out.println();
		}



	}

}
