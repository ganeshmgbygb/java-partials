package Day7;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=0,i=1;
        while(i>0) {
       System.out.println("Enter you choies");
    	System.out.println("1.check balance");
    	System.out.println("2.pin change");
    	System.out.println("3.exit");
    	  break;
    	
    	}
        n=sc.nextInt();
        operations(n);
	}
        public static void operations(int n) {
        	
        	if(n==1) {
        		System.out.println("balance is 10000");
        }else if(n==2) {
    		System.out.println("your pin is change");
        }else if(n==3) {
        	System.out.println("good by");
        }else {
        	System.out.println("invalid input");
        }
        	
    }
}

