package _21ClassHackathon;


public class _1Practice {
	
	

	public static void main(String[] args) {
		int num=012;
		int cOf0=0;
		
		while (num>0) {
			int digit=num%10;
			if(digit==0)cOf0++;
		
			num=num/10;
		}
		
          if(cOf0>0 )System.out.println("Duck number");
          else System.out.println("not duck");
		
	}
		
	}













































//reverseNum = reverseNum * 10 + digit; 