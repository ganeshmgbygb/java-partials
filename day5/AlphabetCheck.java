package day5;
import java.util.Scanner;
public class AlphabetCheck {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the chareter");
		     char a=sc.next().charAt(0);
		     maxnumber(a);
	}
       public static void maxnumber(char a ) {
    	   if((a>='A'&& a <='Z') ||( a>='a'&&a<='z')) {
	        	System.out.println("it ia an Alphabet");
	        }else {
	        	System.out.println("it is not Alphabet ");
	        }
       }
}
