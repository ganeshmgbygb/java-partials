package Day9;
import java.util.Scanner;
public class TransposeofaMatrix {

	public static void main(String []args)
    {
    	int rows,cols;
    	System.out.println("Enter the number of rows of a matrix ");
    	Scanner sc=new Scanner(System.in);
    	rows=sc.nextInt();
    	System.out.println("Enter the number of cols of a matrix ");
    	cols=sc.nextInt();
    }
	public static void transponce(int rows,int cols) {
		int i,j;
    	int a[][]=new int[rows][cols];
    	int b[][]=new int[cols][rows];
    	for(i=0;i<rows;i++)
    	{
    		for(j=0;j<cols;j++)
    		{
    			System.out.printf("Enter the value of a ",i,j);
    			Scanner s=new Scanner(System.in);
    			a[i][j]=s.nextInt();
    			b[j][i]=a[i][j];
    		}
    	}

    	for(i=0;i<cols;i++)
    	{
    		for(j=0;j<rows;j++)
    		{
    			System.out.print(b[i][j]+"   ");
    		}
    		System.out.println();
    	}
    	
    }
}