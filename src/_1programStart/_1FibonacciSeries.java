 package _1programStart;

public class _1FibonacciSeries {

	public static void main(String[] args) {
/////////////Fibonnacci series
//		int a=34,b=21,n=10;
//		System.out.println(a);
//		System.out.println(b);
//		for(int i=0;i<n-2;i++) {
//			int c=a-b;
//			a=b;b=c;
//			System.out.println(c);
//
//		}
/////////////Fibonnacci series using for,while,do-while loop
//		
		int p=0,q=1,r=10;
		System.out.println(p);
		System.out.println(q);
//				
		//1.For loop
//		for(int i=1;i<=r-2;i++) {
//			int s=p+q;
//			System.out.println(s);
//			p=q;
//			q=s;
//		}
		
//		////while loop
//		int i=1;
//		while(i<=r-2) {
//			i++;
//			int s=p+q;
//			System.out.println(s);
//			p=q;
//			q=s;
//		}
		//// do-while loop
		int i=1;
		do {
			i++;
			int s=p+q;
			System.out.println(s);
			p=q;
			q=s;
			
		}while(i<=r-2);

		



	}

}
