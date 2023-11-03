package Day8;

import java.util.Scanner;

public class CountofEvenandOdd {
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
        tab(n,array,count,oddcount);
	}
        public static void tab (int n,int array[],int count,int oddcount) {
        	
        	for(int i=0;i<n;i++) {
        		if(array[i]%2==0) {
        			
        			count++;
        			
        			
        		}else { 
        			
        			oddcount++;
        			
        		}
        		
        		}
        	System.out.println("number of even numbers are "+oddcount);
			System.out.println("number of odd numbers are "+count);
        	
        }
        
		

    	}
        
        



