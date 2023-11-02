package Day7;
import java.util.Scanner;
public class PerfectNumberChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int n= sc.nextInt();
        int on=n;
        perfect(n,on);
	}
	public static void perfect(int n,int on) {
		int sum=0;
		int factor=1;
		while(factor<=n/2) {
			if(n%factor==0) {
				sum = sum+factor;
				
			}
			factor++;	
		}
		if(sum==n) {
			System.out.println(n+"it is a perfect number");
		}else {
			System.out.println(n+"it is not a perfect number");
		}
	}

}
