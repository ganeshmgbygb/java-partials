package Dayy6;
import java.util.Scanner;
public class NaturalNumbersinReverse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number n");
		int n=sc.nextInt();
		revers(n);
	}
     public static void revers(int n) {
    	 System.out.println("NaturalNumbersinReverse are");
    	 for(int i=n;i>=0;i--) {
    		 System.out.println(i);
    	 }
     }
}
