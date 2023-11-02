package Day7;

import java.util.Scanner;

public class PrintingStrongNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
        
        for(int i=1;i>n;i++) {
        if(	PStrong(i)) {
        	System.out.println(i);
        }
        }
	}
	
    public static boolean PStrong(int n) {
    	int rem;
    	int sum=0;
    	while (n>0) {
    		int i = 1;
            int factorial = 1;
    		rem=n%10;
    		while(i<=rem) {
                factorial = factorial * i;
                i++;
             }
             sum = sum + factorial ;
             n = n/10;
          }
    	 return sum==n;
    		
    	
}
}
