package Day7;
import java.util.Scanner;
public class StrongNumberChecker {

	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		int Number, Temp, Reminder,  i, Factorial;
		sc = new Scanner(System.in);
		
		System.out.println(" Please Enter any Number : ");
		Number = sc.nextInt();	
		Number(Number);
	}
	public static void Number(int Number ){
		int Sum=0,Temp=0,Reminder=0,Factorial=0;
		Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1; 
			int i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		   
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		if ( Number == Sum )
		{
			System.out.println(Number + " is a Strong Number");
		}
		else
		{
		   System.out.println(Number + " is Not a Strong Number");
		}
	}
}

