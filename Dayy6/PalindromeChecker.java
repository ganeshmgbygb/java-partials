package Dayy6;
import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		int rem,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
		int temp=n;
		for(int i=0;i<=n;i++) {
			rem=n%10;
			s=(s*10)+rem;
			n=n/10;
		}
		if(n==temp) {
			System.out.println("it is a palaradrome");
		}else {
			System.out.println("it is not a palidrome");
		}

	}

}
