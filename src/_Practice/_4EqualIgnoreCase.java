package _Practice;

public class _4EqualIgnoreCase {

	public static boolean equalIgnore(String s1, String s2) {
		int i=0;
		while (i<=s1.length() && i<=s2.length()-1) {
			if(s1.charAt(i)<='Z') {
				char ch1=(char) (s1.charAt(i)+32);
				
			}
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
		return false;
	}
	public static void main(String[] args) {

        char ch1='A'+32;
		System.out.println(ch1);
	}

}
