package _11AbstractClass;

public class Crocodile implements _1Animal{

	@Override
	public void move() {
     System.out.println("Move in the Water.");		
	}
	
	@Override
	public void livesBelowWater() {

		System.out.println("Yes,Crocodile lives Below the water");
	}
}
