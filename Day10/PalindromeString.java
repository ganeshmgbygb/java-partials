package Day10;
import java.util.Scanner;
public class PalindromeString {
	public static void main(String[] args) 
	{
		 String s;
		 System.out.println("Enter the String ");
		 Scanner sc=new Scanner(System.in);
		 s=sc.nextLine();
		 String s1=s;
		char a[]=s.toCharArray();
		Palindrome(s,a,s1);
	}
	public static void Palindrome(String s,char a[],String s1) {
		String rev="";
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		if(s1.equals(rev))
		{
			System.out.println( s +" String is a Palindrome ");
		}
		else
		{
			System.out.println(s+" String is Not a Palindrome ");
		}
	}

}
