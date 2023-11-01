package Dayy6;
import java.util.Scanner;
public class SumofEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        SumofEvenNumbers pn=new SumofEvenNumbers();
       pn.Seven(n);
	}
    public void Seven(int n) {
    	int sum=0;
    	System.out.println("the  sum even numbers are");
    	for(int i=0;i<=n;i++) {
    		if(i%2==0) {
    			sum=sum+i;
    			System.out.println(sum);
    		}
    		
    	}	

	}

}
