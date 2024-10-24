package _2Method;

public class _1AreaOfRectangle {
	public double Area(double length,double width) {
		double area=length*width;
		return area;
	}

	public static void main(String[] args) {

		_1AreaOfRectangle ref=new _1AreaOfRectangle();
		double r=ref.Area(12.3d,12.3d);
		System.out.println("Area of rectangle is:"+r+"sqm.");
		
	}

}
