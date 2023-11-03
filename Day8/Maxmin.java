package Day8;
import java.util.Scanner;
public class Maxmin {
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of array");
	        int n = sc.nextInt();
	        int array[] = new int[n];
	        System.out.println("Enter the elements in array");
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }
	        largestandsmallest(n,array);
	}
	        public static void largestandsmallest(int n,int array[]) {
	        int max = array[0];
	        int min= array[0];
	        for (int i = 1; i < n; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	            if (array[i]<min) {
	            	min=array[i];
	            }

	        }
	        System.out.println("The highest element is " + max);
	        System.out.println("the smallest element is "+min);
	    }
	}

