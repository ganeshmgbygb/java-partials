package Day10;
import java.util.Scanner;
public class LastOccurrenceString {
	public static void main(String[] args) 
	{
		String s;
		System.out.println("enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("Enter the character ");
		char ch=sc.next().charAt(0);
		Last(s,ch);
	}
	public static void Last(String s,char ch) {
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]==ch)
			{
				System.out.print("The position of "+ch+" "+"is"+" "+i);
				break;
			}
		}
	}

}
