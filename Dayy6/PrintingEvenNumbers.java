package Dayy6;
import java.util.Scanner;
public class PrintingEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        PrintingEvenNumbers pn=new PrintingEvenNumbers();
       pn.Even(n);
	}
    public void Even(int n) {
    	System.out.println("the even numbers are");
    	for(int i=0;i<n;i++) {
    		if(i%2==0) {
    			System.out.println( i);
    		}
    	}
    }
}
