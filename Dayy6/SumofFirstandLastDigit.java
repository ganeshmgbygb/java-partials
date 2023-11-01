package Dayy6;
import java.util.Scanner;
public class SumofFirstandLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a n value");
		int n=sc.nextInt();
		int sum;
		int m=0;
		 n=n%10;
	     System.out.println("the last digit of a number is"+n);
		for(int i=0;i<n;i++) {
			n=n/10;
			 m=n;
			System.out.println("the first digit of anumber is"+m);
		}
		    
		     sum=m+n;
		     System.out.println("the sum of last and first is"+sum);
		     
	
}
}

