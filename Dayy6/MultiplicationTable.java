package Dayy6;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        MultiplicationTable mt=new MultiplicationTable();
       mt.Table(n);
	}
    public void Table(int n) {
    	int mul=0;
    	System.out.println("the MultiplicationTable are");
    	for(int i=0;i<=10;i++) {
    			mul=n*i;
    			System.out.println(mul);
    		}
    	}	

	}


