package _Practice;

public class _5copyArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6};
		int arr2[]=new int[arr.length];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=arr[i];
		}
		
		
		for (int b : arr2) {
			System.out.println(b);
		}
	}

}
