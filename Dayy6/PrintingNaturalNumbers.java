package Dayy6;
import java.util.Scanner; 
public class PrintingNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n");
		int n=sc.nextInt();
		numbers(n);

	}
     public static void numbers(int n) {
    	 System.out.println("the natural numbers are ");
    	 for(int i=0;i<=n;i++) {
    		 System.out.println(i);
    	 }
     }
}
