package Day9;
import java.util.Scanner;
public class InsertanElement {

	public static void print(int a[])
	{
		int i,position,new_element;
		int b[]=new int[a.length+1];
		for(i=0;i<a.length;i++)
		{
			System.out.printf("Enter the value of a[%d]",i);
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the new element to be stored ");
		Scanner sc=new Scanner(System.in);
		new_element=sc.nextInt();
		System.out.println("Enter the position to be inserted ");
		position=sc.nextInt();
		for(i=0;i<b.length;i++)
		{
			if(i==position)
			{
				b[i]=new_element;
			}
			else if(i>position)
			{
				b[i]=a[i-1];
			}
			else
			{
				b[i]=a[i];
			}
		}
		System.out.println("Updated Array are");
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the size of an array is ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		print(a);
	}
}
