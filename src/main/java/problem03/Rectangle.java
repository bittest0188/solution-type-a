package problem03;

public class Rectangle extends Shape implements Resizable {
	// 사각형
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		System.out.println("");
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		this.width = width*rate;
		this.height = height*rate;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return 2*(width+height);
	}
}