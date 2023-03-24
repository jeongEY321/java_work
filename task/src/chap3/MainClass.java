package chap3;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart m = new MyCart(2100);
		Product tv = new Tv();
		Product radio = new Radio();
		Product computer = new Computer();
		
		m.buy(tv);
		m.buy(radio);
		m.buy(computer);
		
		m.info();
		
	}

	

	

}
