package Day10;
import java.util.Scanner;
public class SearchAllOccurrencesinString {
	public static void main(String[] args) 
	{
		String s;
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char a[]=s.toCharArray();
		System.out.println("Enter the Character ");
		char ch=sc.next().charAt(0);
		Search(s,a,ch);
	}
		public static void Search(String s,char a[],char ch) {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ch)
			{
				System.out.println("All Occurences of a character is "+" "+i+"   ");
			}
		}
	}

}
