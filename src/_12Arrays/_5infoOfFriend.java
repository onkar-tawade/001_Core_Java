package _12Arrays;

import java.util.Arrays;

public class _5infoOfFriend {
	
	public  String name;
	public  long phoneNo;
    public  String ID;
    
    public static void main(String[] args) {
		_5infoOfFriend f1=new _5infoOfFriend();			
		f1.name="Shubham";
		f1.phoneNo=7588573215L;
		f1.ID="JBK010203";
		
		_5infoOfFriend f2=new _5infoOfFriend();	
		f2.name="Pratik";
		f2.phoneNo=9482273215L;
		f2.ID="JBK123456";
		
		_5infoOfFriend f3=new _5infoOfFriend();
		f3.name="Pasha";
		f3.phoneNo=8856573215L;
		f3.ID="JBK987654";
		
		_5infoOfFriend[] frndInfo= {f1,f2,f3};

	}

}
