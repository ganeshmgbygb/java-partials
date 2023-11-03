package Day8;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySorting {
	public static void main(String args[]) {
		 int i;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of array");
	        int n = sc.nextInt();
	        int array[] = new int[n];
	        System.out.println("Enter the array of items");
	        for ( i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }
	        Sort(n,array);
}
	      public static void Sort(int n,int array[]) {
	    	  System.out.println("the array sorting order");
	    	  int temp=0;
	    	  for(int i=0;i<n;i++) {
	    		  for(int j=i+1;j<n;j++) {
	    		  if(array[i]<array[j]) {
	    			  temp=array[i];
	    			  array[i]=array[j];
	    			  array[j]=temp;
	    			  
	    		  }
	    		  
	    		  }
	    		  System.out.println(array[i]);
	    	  }
	      }
}
