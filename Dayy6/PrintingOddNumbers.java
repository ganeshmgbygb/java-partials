package Dayy6;
import java.util.Scanner;
public class PrintingOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        PrintingOddNumbers pn=new PrintingOddNumbers();
       pn.Odd(n);
	}
    public void Odd(int n) {
    	System.out.println("the odd numbers are");
    	for(int i=0;i<n;i++) {
    		if(i%2!=0) {
    			System.out.println( i);
    		}
    	}	

	}

}
