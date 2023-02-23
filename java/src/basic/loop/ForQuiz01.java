package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		/*
		 2~19까지의 난수를 생성하셔서 구구단을 출려해 보세요.
		 19행까지 출력하세요.
		 */
		int i = (int) ((Math.random()*18)+2);
		for(int a =1; a <=19; a++ ) {
			System.out.printf("%dX%d=%d\n", i, a, i*a );
			
		}
		
		
		
		
	}

}
