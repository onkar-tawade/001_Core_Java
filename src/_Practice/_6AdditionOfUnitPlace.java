package _Practice;

public class _6AdditionOfUnitPlace {

	public static void main(String[] args) {

		int arr[]= {34,7,90,12,5};
		int arr2[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i]%10;
		}
		
		int sum=0;
		for (int b : arr2) {
		sum+=b;	
		}
		
		System.out.println("Addition is:"+sum);
	}

}
