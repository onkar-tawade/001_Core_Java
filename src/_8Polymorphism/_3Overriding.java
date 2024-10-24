package _8Polymorphism;

public class _3Overriding {
	
	public static float area(float radius) {
		float a=3.14f*radius*radius;
		return a;
	}
	public static double area(double l,double b) {
		double a=l*b;
		return a;
		}
	public static double area(float base,double height) {
		double a=0.5f*(base*height);
		return a;
		}
	

	public static void main(String[] args) {

		System.out.println("Area of circle is:"+area(2.12f)+"sqcm");
		System.out.println("Area of Rectangle is:"+area(3.0, 3.0)+"sqcm");
		System.out.println("Area of Triangle is:"+area(10.18f,3.2)+"sqcm");
		

		
	}

}
