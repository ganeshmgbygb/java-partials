package Day7;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	int i=0;
        	int n=0;
        	int balance=10000;
        	while(true) {
        	       System.out.println("Enter you choies");
        	    	System.out.println("1.check balance");
        	    	System.out.println("2.With draw amount");
        	    	System.out.println("3.exit");
        	    	n=sc.nextInt();
        	
        	if(n==1) {
        		System.out.println("balance is "+balance);
        }else if(n==2) {
    		System.out.println("Enter the amount");
    		 System.out.print("Enter the withdrawal amount: ");
             int withdrawalAmount = sc.nextInt();
             if (withdrawalAmount < 0) {
                 System.out.println("Invalid withdrawal amount. Please enter a positive value.");
             } else if (withdrawalAmount > balance) {
                 System.out.println("Insufficient funds. Withdrawal not allowed.");
             } else {
                 balance -= withdrawalAmount;
             }
        }else if(n==3) {
        	System.out.println("good by");
        	System.exit(0);
        }else {
        	System.out.println("invalid input");
        }
        	
    }
}
        }

