package Day10;
import java.util.Scanner;
public class Count_of_vowles_Consonants {
	public static void main(String[] args) 
	{
		String s;
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		
		s=sc.nextLine();
		s=s.toLowerCase();
		count(s);
	}
		public static void count(String s) {
			int vowel=0,consonants=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='o')||(s.charAt(i)=='u')||(s.charAt(i)=='u'))
			{
				vowel++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("The Total number of Vowels are "+vowel);
		System.out.println("The Total number of Consonants are "+consonants);
		

	}

}

