package Day7;
import java.util.Scanner;
public class PrintingPerfectNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int n= sc.nextInt();
        int on=n;
        for(int i=1;i<n;i++) {
        if(perfectn(i)){
        	System.out.println(i);
        }
        	
        }
	}
	public static boolean perfectn(int n) {
		int sum=0;
		int factor=1;
		
		while(factor<=n/2) {
			if(n%factor==0) {
				sum = sum+factor;
				
			}
			factor++;	
		}
		return sum==n ;
			

}
	}

