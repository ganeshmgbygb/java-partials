package Day9;
import java.util.Scanner;
public class SearchElementinArray {

	
		public static void main(String[] args)
		{   
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Array Limit :");
			int n =sc.nextInt();
			int [] a =new int[n];
			Search(n,a);
		}
		public static void Search(int n,int a[]) {
			Scanner sc =new Scanner(System.in);
			for(int i=0;i<n;i++)
			{
				System.out.printf("Element of a[%d] :",i);
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the element to be seached");
			int search = sc.nextInt();
	       int flag=0;
	    	
	    		for(int i=0;i<n;i++)
	    		{
	        		if(a[i]==search)
	        		{
	            			System.out.println("Element "+search+" found at "+i+" position");
	            			flag=1;
	            			break;
	        		}
	    		}
	    		if(flag==0)
	    		{
	        		System.out.println("Element "+search+" not found");
	    		}
		}

}
