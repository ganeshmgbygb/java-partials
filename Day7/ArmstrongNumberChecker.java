package Day7;
import java.util.Scanner;
public class ArmstrongNumberChecker {
	 public static void main(String args[]){
	     int sum=0;
	    Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    int originalNumber = number;
	    while (number > 0) 
	    {
	        int digit = number % 10;
	        sum =sum+digit*digit*digit ;
	        number /= 10;
	    }

	    if (sum == originalNumber) 
	    {
	        System.out.println(originalNumber + " is an Armstrong number.");
	    } else 
	    {
	        System.out.println(originalNumber + " is not an Armstrong number.");
	    }
	}
	}

