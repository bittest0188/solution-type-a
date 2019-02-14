package problem03;

public class RectTriangle extends Shape {
	//삼각형
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		System.out.println("");
		return width*height/2;
	}

	@Override
	public double getPerimeter() {
		//직각삼각형의 둘레???
		return 0.;
	}
}
