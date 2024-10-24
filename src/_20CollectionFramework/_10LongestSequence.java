package _20CollectionFramework;


public class _10LongestSequence {

	public static void main(String[] args) {

		boolean b[]=new boolean[26];
		

		String s="cadbury";
		
		for (int i = 0; i < s.length(); i++) {
			int num=(int)s.charAt(i)-97;
			b[num]=true;
		}
		
		for (int i = 0; i < b.length; i++) {
           if (b[i]==false) {
			return;
		}
           else {
        	   System.out.print((char)(i+97));
           }
		}
		
		
	}
}
