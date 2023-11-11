package Day9;
import java.util.Scanner;
public class ArrayRotation {

	public static void main(String args[])
	{
		int n,i,temp,temp1,rotations;
		System.out.println("Enter the size of an array ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		
	}
	public static void rotations(int n, int a[]) {
		int i,temp,temp1,rotations;
		for(i=0;i<n;i++)
		{
			System.out.printf("Enter the value ",i);
			Scanner sc1=new Scanner(System.in);
			a[i]=sc1.nextInt();
		}
		temp=a[n-1];
		System.out.println("Enter the number of rotations to the left  ");
		Scanner sc=new Scanner(System.in);
		rotations=sc.nextInt();
		for(int k=0;k<rotations;k++)
		{
		for(i=n-1;i>0;i--)
		{
			temp1=a[i-1];
			a[i-1]=temp;
			temp=temp1;
		}
		a[n-1]=temp;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}
}


