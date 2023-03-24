package oop.ads.quiz;

public class Circle extends Shape {
double radius;
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double ans = radius *  radius * Math.PI;
		return ans;
		
	}

}
