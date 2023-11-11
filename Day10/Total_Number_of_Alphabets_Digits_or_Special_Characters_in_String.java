package Day10;
import java.util.Scanner;
public class Total_Number_of_Alphabets_Digits_or_Special_Characters_in_String {
	public static void main(String[] args) 
	{
		
		String s;
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		 s=sc.nextLine();
		 s=s.toLowerCase();
		 logic(s);
	}

	public static void logic(String s) {
		int i,alphabet=0,digit=0,special_character=0;
		for(i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a')&&(s.charAt(i)<='z'))
			{
				alphabet++;
			}
			else if((s.charAt(i)>='0')&&(s.charAt(i)<'9'))
			{
				digit++;
			}
			else
			{
				special_character++;
			}
		}
		System.out.println("The Total number of  Alphabets "+alphabet);
		System.out.println("The Total number of Digits "+digit);
		System.out.println("The Total number of Special Characters "+special_character);

	}
}




