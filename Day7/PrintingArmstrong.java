package Day7;
import java.util.Scanner;
public class PrintingArmstrong {

	public static void main(String[] args) {
		  
		  
		  Scanner sc = new Scanner(System. in );

		  System.out.println("Enter the value of n: ");
		  int n = sc.nextInt();
		  Armstrong(n);
	}
	public static void Armstrong(int n) {
		int a,num, b = 0;
		  for (int i = 1; i <= n; i++) {
		   num = i;
		   b = 0;
		   while (num > 0) {
		    a = num%10;
		    num = num / 10;
		    b = b + (a * a * a);
		   }
		   if (i == b) 
		   System.out.println(i);
		  }
		 }
		}

    

