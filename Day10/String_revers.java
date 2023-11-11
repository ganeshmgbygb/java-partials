package Day10;
import java.util.Scanner;
public class String_revers {
	public static void main(String[] args) 
	{
		String s;
		
		System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		revers(s);
	}
	public static void revers(String s) {
		int i;
		String rev="";
		char a[]=s.toCharArray();
		for(i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("The Reverse of a String is "+rev);
	}

}
