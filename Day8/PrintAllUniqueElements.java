package Day8;
import java.util.Scanner;
public class PrintAllUniqueElements {
	 public static void main(String args[]) {
	        int tc = 0;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("enter the array size");
	    int n = scanner.nextInt(); 
	    System.out.println("read the array elements");
	    int x[] = new int [n];
	    for(int i=0;i<n;i++) {
	         x[i] = scanner.nextInt(); 
	    }
	    DuplicateElements(n,x,tc);
	    }
	    public static void DuplicateElements(int n,int x[],int tc) {
	    
	     boolean visited[]=new boolean[n];
	        for (int m=0;m<n;m++) {
	        visited[m]=false;
	        }
	        for(int i=0;i<n;i++) {
	            if (visited[i]==true)
	            continue;
	            int count =1;
	            for(int j=i+1;j<n;j++) {
	                if(x[i]==x[j]) {
	                    visited[j] = true;
	                    count++;
	                }
	            }
	      if(count==1) {
	          tc++;
	          
	      }

	        }
	        System.out.println("the total number of Unique elements are " + tc);
	    }
	    }