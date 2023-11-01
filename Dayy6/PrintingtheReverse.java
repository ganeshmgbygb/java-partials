package Dayy6;
import java.util.Scanner;
public class PrintingtheReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
        revers(n);
	}
    public static void revers(int n) {
    	int rem,s=0;
    	while(n>0) {
    	rem=n%10;
		s=(s*10)+rem;
		n=n/10;
    	}
    	System.out.println("the revers order is "+ s);
    }
}
