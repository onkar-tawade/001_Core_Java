package _2Method;

public class _7AreaTriangle {

	private float AreaOfTriangle(float h,float b) {
		float area=(h*b)/2;
		return area;
		
	}
	public static void main(String[] args) {

		_7AreaTriangle ref=new _7AreaTriangle();
		float t=ref.AreaOfTriangle(10.0f,10.0f);
		System.out.println("Area of Triangle is:"+t+"sqm");
	}

}
