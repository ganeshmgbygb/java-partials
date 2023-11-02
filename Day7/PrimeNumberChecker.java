package Day7;
import java.util.Scanner;
public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		PrimeNumberChecker pc=new PrimeNumberChecker();
		pc.Number(n);

	}
	public void Number(int n) {
	  int count=0;
	  for(int i=2;i>n/2;i++)
		  if((n%i)==0) {
			  count++;
		  }
	  if(count==1) {
		  System.out.println(n+" it is a prime number");
	  }else {
		  System.out.println(n+" it is not a prime number");
	  }
		  
	}

}
