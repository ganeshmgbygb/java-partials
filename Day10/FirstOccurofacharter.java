package Day10;
import java.util.Scanner;
public class FirstOccurofacharter {
	public static void main(String[] args) 
	{
			String s;
			System.out.println("Enter the String ");
			Scanner sc=new Scanner(System.in);
			s=sc.nextLine();
			System.out.println("Enter the Character ");
			char ch=sc.next().charAt(0);
			First(s,ch);
	}
	public static void First(String s,char ch) { 
			char a[]=s.toCharArray();
			for(int i=0;i<a.length;i++)
			{
			     if(a[i]==ch)
			     {
			    	 System.out.println("The position of "+ch+" "+"is"+"  "+i);
			    	 break;
			     }
			     
			}
	}

}

