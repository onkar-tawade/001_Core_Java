package _7Practical;

public class MaxNum {

	public static void main(String[] args) {

		int num1=100,num2=232,num3=15;
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+" is a greater number");
			}
			else System.out.println(num3+" is a greater number");
		}
		else if(num2>num3) {
			System.out.println(num2+" is a greater number");
		}
		else {
			System.out.println(num3+" is a greater number");

		}
	}

}
