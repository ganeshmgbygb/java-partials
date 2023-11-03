package Day8;
import java.util.Scanner;
public class CountTotalNumberofNegativeElements {
	
		public static void main(String args[]) {
			int count=0,oddcount=0;
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of array");
	        int n = sc.nextInt();
	        int array[] = new int[n];
	        System.out.println("Enter the elements in array");
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	            
	        }
	        Element(n,array);
}
	
	public static void Element(int n,int array[]) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(array[i]<0) {
				count++;//1//2//3
				
			}
			
		}
		System.out.println("total count of negative numbers are"+count);
	}
}



