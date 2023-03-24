package basic.loop;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int i = 1;
		int to = 0;
		while(i <=1000) {
			if(1000%i==0) {
				to++;
			}
			i++;
		}System.out.println(to);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
