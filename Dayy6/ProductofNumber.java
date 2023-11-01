package Dayy6;
import java.util.Scanner;
public class ProductofNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		product(n);
	}
	 public static void product(int n) {
	    	int rem,sum=1;
	    	while(n>0) {
	    		rem=n%10;
	    		sum=sum*rem;
	    		n=n/10;
	    	}
	    	System.out.println("product of digits are "+sum);
	    }
}
