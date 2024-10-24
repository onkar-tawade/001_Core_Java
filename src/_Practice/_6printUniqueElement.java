package _Practice;

import java.util.Arrays;

public class _6printUniqueElement {

	public static void main(String[] args) {

		int arr[]= {1,2,3,2,4,3,5,5,5,4};
//	    for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		
		Arrays.sort(arr);///Inbuilt-Method.....
		
	   for (int i = 0; i < arr.length; i++) {
		   if(i==arr.length-1) {
			   System.out.println(arr[arr.length-1]);
		   }
		   else if (arr[i]<arr[i+1]) {
			System.out.println(arr[i]);
		}
	}
	}

}
