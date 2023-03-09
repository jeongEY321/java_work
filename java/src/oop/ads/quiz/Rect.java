package oop.ads.quiz;

public class Rect extends Shape {
double side;
	public Rect(String name, double side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {
		double ans = side * side; 
		return ans;
	}

}
