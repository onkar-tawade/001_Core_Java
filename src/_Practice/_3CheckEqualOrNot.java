package _Practice;

public class _3CheckEqualOrNot {

	public static boolean checkEquals(String s1,String s2) {
		int i=0;

		while (i<s1.length() && i<s2.length()) {
			if(i==s1.length()-1 && i==s2.length()-1) {
				return true;
			}
			if (s1.charAt(i)==s2.charAt(i)) {
				i++;
			}
			else {
				return false;
			}
		}
		
//		if(s1==s2) {
//			return true;
//		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(checkEquals("Hanuman", "Hanuman"));
	}
}
