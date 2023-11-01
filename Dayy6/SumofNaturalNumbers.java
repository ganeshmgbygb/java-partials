package Dayy6;
import java.util.Scanner;
public class SumofNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n");
		int n=sc.nextInt();
		numbers(n);

	}
     public static void numbers(int n) {
    	 int sum=0;
    	 System.out.println("sum of natural numbers are ");
    	 for(int i=0;i<=n;i++) {
    		 sum=sum+i;
    		 
    	 }
    	 System.out.println(sum);
     }


	}


