package _7Practical;

public class maxOdd {

	public static void main(String[] args) {

		int arr[]= {12,15,14,19,65,13,33,89,56,113
				};
		int max=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]%2!=0 && max<arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

}
