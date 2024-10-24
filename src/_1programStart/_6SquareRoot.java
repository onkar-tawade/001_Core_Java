package _1programStart;

public class _6SquareRoot {

	public static void main(String[] args) {

        int n=4,count=0;
        for (int i = 1; i <i+1 ; i++) {
            if(i%2!=0){
            	if(n!=0) {
                n=n-i;
                count++;
            	}
            }
        }
        System.out.println("Square root is "+count);
	}

}
