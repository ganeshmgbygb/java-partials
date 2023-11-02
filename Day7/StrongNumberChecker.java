package Day7;
import java.util.Scanner;
public class StrongNumberChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
        int t=n;
        Strong(n,t);
	}
    public static void Strong(int n,int t) {
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
    	if(sum==t) {
    		System.out.println(t+" it is a Strong number");
    	}else {
    		System.out.println(t+" it is not a Strong number");
    	}
    		
    	}
    }

