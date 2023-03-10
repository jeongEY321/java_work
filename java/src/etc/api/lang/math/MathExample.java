package etc.api.lang.math;

public class MathExample {
	public static void main(String[] args) {
		//올림
		int j = (int) Math.ceil(1.1);
		System.out.println(j);
		//내림
		double k = Math.floor(1.5);
		System.out.println(k);
		//반올림
		double d2 = Math.round(3.14);
		System.out.println(d2);
		
		double d3 = Math.round(3.54);
		System.out.println(d3);
		
		double d4 = Math.round(3.141592*1000) * 0.001;
		System.out.println(d4);
		//제곱
		double d5 = Math.pow(3.0, 4.0);
		System.out.println(d5);
		
		//최대값
		int max = Math.max(2, 10);
		System.out.println(max);
		
		//최소값
		int min = Math.min(24, 33);
		System.out.println(min);
		
		
		
		
		
		
		
		
		
	}
}
