package _11AbstractClass;

public class TigerCh extends Tiger {
	
	@Override
	public void livesBelowWater() {

		System.out.println("No yarrr...........");
	}

	public static void main(String[] args) {

		TigerCh ref=new TigerCh();
		ref.move();
		ref.livesBelowWater();
		
		
	}

}
