package basic.loop;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
		//1~3만까지의 정수 중 258의 배수의 개수를 출력.
				int a = 1;
				int tot = 0;
						
					while(a <= 30000) {
							if(a % 258 == 0) {
								tot++;
							}
							
							
							a++;
						}System.out.println(tot);
		
		
		
		
		
		
	}

}
