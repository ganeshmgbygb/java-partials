package Dayy6;
import java.util.Scanner;
public class SumoftheDigits {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	int n=sc.nextInt();
	sum(n);

	}
    public static void sum(int n) {
    	int rem,sum=0;
    	while(n!=0) {
    		rem=n%10;
    		sum=sum+rem;
    		n=n/10;
    	}
    	System.out.println("sum of digits are "+sum);
    }
}
