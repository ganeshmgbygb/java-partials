package Dayy6;
import java.util.Scanner;
public class Sumofodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        Sumofodd pn=new Sumofodd();
       pn.Odd(n);
	}
    public void Odd(int n) {
    	int sum=0;
    	System.out.println("the odd numbers are");
    	for(int i=0;i<n;i++) {
    		if(i%2!=0) {
    			sum=sum+i;
    			System.out.println( sum);
    		}
    	}	

	}


	}

