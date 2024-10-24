package _10AbstarctionVariable;

public class Student extends Bag implements Pen {
	@Override
	public void used() {

		super.used();
		System.out.println("I also used Pen");
	}
	}


