package Day10;
import java.util.Scanner;
public class count_total_number_of_words {
	public static void main(String[] args) 
	{
		String s;
		
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		total(s);
	}
		public static void total(String s) {
			int count=1;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' '))
			{
				count++;
			}
		}
		System.out.println("The Total Number of Words in a String "+count);
	}

}
