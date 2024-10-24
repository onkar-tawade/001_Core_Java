package _Practice;

public class _2ReturnCharacterIndex {

public static char returnIndex(String s,int n) {
		

		for (int i = 0; i < s.length(); i++) {
			if(i==n) {

				return s.charAt(i);
			}
		}
		return '0';
		
	}
	public static void main(String[] args) {

		System.out.println(returnIndex("Hanuman", 3));
	}

}
