package _Practice;

public class _1stReturnIndex {
	
	public static int returnIndex(String s,int n) {
		

		int ans=-1;
		for (int i = n; i < s.length(); i++) {
			if(s.charAt(i)=='n') {
				ans=i;
			}
		}
		if (ans>=0) {
			return ans;
		}
		return -1;
	}

	public static void main(String[] args) {
		String str="mnjhlki";
		int index=0;
		
        System.out.println(returnIndex(str, index));
	}

}
