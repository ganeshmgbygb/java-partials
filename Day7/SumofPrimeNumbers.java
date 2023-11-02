package Day7;

import java.util.Scanner;

public class SumofPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		prime(n);
	}
	public static void prime(int n) {
		int i=1;
		int count;
		int sum=0;
		
		while(i<=n) 
		{
			count=0;
			int j=1;
			while(j<=i) 
			{
				if(i%j==0) 
				{
				count++;
				
				
				}
				j++;
				
			}
			if(count==2) {
				sum=sum+i;
				System.out.println(sum);
			}
			i++;
		}
		
	}
}
