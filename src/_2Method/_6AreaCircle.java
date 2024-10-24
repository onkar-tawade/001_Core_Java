package _2Method;

public class _6AreaCircle {

	public float AreaOfCircle(int r) {
		float pi=3.44f;
		float area=pi*r*r;
		return area;
		
	}
	public static void main(String[] args) { 
		
     _6AreaCircle ref=new _6AreaCircle();
     float y=ref.AreaOfCircle(12);
     System.out.println("Area of circle is:"+y+"sqm");
	}

}
