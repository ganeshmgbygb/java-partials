package Day9;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String args[]) 
	{
		int rows,cols,rows1,cols1,i,j;
		
		System.out.println("Enter the number of rows of first matrix ");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		System.out.println("Enter the number of cols of first matrix ");
		cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		
		System.out.println("Enter the number of rows of second matrix ");
		rows1=sc.nextInt();
		System.out.println("Enter the number of cols of second matrix ");
		cols1=sc.nextInt();
		
		int b[][]=new int[rows1][cols1];
		Mul(rows,cols,rows1,cols1,b,a);
	}
		public static void Mul(int rows,int cols,int rows1,int cols1,int b[][],int a[][]) {
		int i,j;
		System.out.println("Enter the first matrix elements");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.printf("Enter the value of a ",i,j);
				Scanner sc1=new Scanner(System.in);
				a[i][j]=sc1.nextInt();
			}
		}
		
		System.out.println("Enter the Second matrix elements");
		for(i=0;i<rows1;i++)
		{
			for(j=0;j<cols1;j++)
			{
				System.out.printf("Enter the value of b ",i,j);
				Scanner sc2=new Scanner(System.in);
				b[i][j]=sc2.nextInt();
			}
		}
		
		if((rows==rows1)&&(cols==cols1))
		{
			int c[][]=new int[rows][cols];
			for(i=0;i<rows;i++)
			{
				for(j=0;j<cols;j++)
				{
					c[i][j]=a[i][j]*b[i][j];
				}
			}
			for(i=0;i<rows;i++)
			{
				for(j=0;j<cols;j++)
				{
					System.out.print(c[i][j]+"  ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("multiplaction is not possible");
		}
	}
}