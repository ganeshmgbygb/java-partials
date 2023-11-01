package Dayy6;
import java.util.Scanner;
public class FirstandLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a n value");
		int n=sc.nextInt();
		FirstandLastDigit fl=new FirstandLastDigit();
		fl.last(n);
		first(n);
	}
	public static void first(int n) {
		for(int i=0;i<n;i++) {
			n=n/10;
		}
		System.out.println("the first digit of a number is"+n);
	}
	public void last(int n) {
		n=n%10;
		System.out.println("the last digit of a number is"+n);
	}

}
