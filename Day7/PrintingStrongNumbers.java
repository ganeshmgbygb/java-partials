package Day7;

import java.util.Scanner;

public class PrintingStrongNumbers {
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		int Number, i;
		System.out.println(" Please Enter any Number : ");
		Number = sc.nextInt();	
		for ( i = 1; i <=Number; i++)
		{
			if (isItStrong(i))
			{			
				System.out.println(i);
			}
		}
	}
	public static boolean isItStrong(int Number ){
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
		  return true;
		}else {
		return false;
		}
}
}
