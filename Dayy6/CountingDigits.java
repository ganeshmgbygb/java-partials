package Dayy6;
import java.util.Scanner;
public class CountingDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		CountingDigits cd=new CountingDigits();
		cd.Digits(n);
	}
    public void Digits(int n) {
    	int count=0;
    	for(int i=0;i<n;i++) {
    		n=n/10;
    	count++;
    	}
    	System.out.println(count);
    }
}
