//"Assignment 1: Maximum Between Two Numbers
package ganeshapp;
import java.util.Scanner;

public class Maxmumoftownumbers {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the a value");
        int a= sc.nextInt();
        System.out.println("Enter the b value");
        int b= sc.nextInt();
        if(a>b) {
        	System.out.println("a is greater than b");
        }else {
			System.out.println("b is greater than a");
		}
        
	}

}
