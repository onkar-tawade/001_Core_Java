package _12Arrays;

public class _1st {

	public static void main(String[] args) {

		int[]arr={2,3,4,5,6,7};
		System.out.println(arr.length);/////Here we find out the length
		
		//////Here we find out the sum of all elements
		int sum=0;
//		for (int i = 0; i < arr.length; i++) {
//			sum+=arr[i];
//		}
//		System.out.println("Sum of all array elements is:"+sum);
		
		////Here we find out the sum of all even
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
			}
		}	System.out.println("Sum of all odd array elements is:"+sum);
		
//		for (int i = 0; i < arr.length; i++) {
//		if(arr[i]%2==0) {
//			sum+=arr[i];
//		}
//	}	System.out.println("Sum of all even array elements is:"+sum);
		
		

		
		
	}

}
