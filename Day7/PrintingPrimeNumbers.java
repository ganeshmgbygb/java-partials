package Day7;
import java.util.Scanner;
public class PrintingPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		prime(n);
	}
	public static void prime(int n) {
		int i=1;
		int count;
		System.out.println("printing prime numbers 1 to "+n+" numbers");
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
				System.out.println(i);
			}
			i++;
		}
		
	}
	

}
