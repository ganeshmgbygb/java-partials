package Day12;
import java.util.Scanner;

 class Operations1 {
   
    public void calculateArea(double radius) {
       double pi=3.14;
    	double result= pi * radius * radius;
       System.out.println(result);
    }

    
    public void calculateArea(double length, double width) {
        double result= length * width;
        System.out.println(result);
    }
    public void calculateArea(int base, int height) {
        double result= 0.5 * base * height;
        System.out.println(result);
    }
 }



public class OverloadingShape {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Operations1 s=new Operations1();
	System.out.println("Enter the circle area");
	s.calculateArea(sc.nextInt());
	System.out.println("Enter the rectangle area");
	s.calculateArea(sc.nextInt());
	System.out.println("Enter the triangle area");
	s.calculateArea(sc.nextInt());
	
}
}
 
