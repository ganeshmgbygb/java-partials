package Day12;
import java.util.Scanner;
class Shape{
	public void Sarea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		double pi=3.14;
		double area=4*pi*(radius*radius);
		System.out.println("the area of Sphear"+area);
	}
	public void Sparameter(double pi) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int ra=sc.nextInt();
		double volume=(4.0/3.0)*pi*(ra*ra*ra);  
		System.out.println("the volume of Sphear"+volume);
	}
}
class Circle extends Shape {
	public void Carea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		double area=(22*radius*radius)/7;
		System.out.println("the area of Sphear"+area);
	}
	public void Cparameter( int radius) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		 radius=sc.nextInt();
		double pi= 3.14;
		double volume=2*radius*pi;
		System.out.println("the volume of Sphear"+volume);
}
}
class rectangle extends Shape{
	public void Rarea() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length");
	int l=sc.nextInt();
	System.out.println("Enter the breath");
	int beath=sc.nextInt();
	int area=1*beath;
	System.out.println("area of react angle"+area);
	}

public void Rparameter(int l,int beath) {
	int parementer=2*(l+beath);
	System.out.println("perameter of rectangle"+parementer);
}
}
class Triangle extends Shape{
	
	public void Tarea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the breath");
		int beath=sc.nextInt();
		int area=1*beath/2;
		System.out.println("area of triangle"+area);
		
		
	}
	public void Tparameter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		int a=sc.nextInt();
		System.out.println("Enter the b");
	    int b=sc.nextInt();
		System.out.println("Enter the c");
		int c=sc.nextInt();
		int parameter =a+b+c/2;
		System.out.println("parameter of triangle"+parameter);
}
}
class RightTriangle extends Triangle{
	public void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the breath");
		int beath=sc.nextInt();
		int area=1*l+beath*beath;
		System.out.println("area of right triangle"+area);
	}
}



public class ShapeHierarchy {
	public static void main(String[] args) {
		RightTriangle rt=new RightTriangle();
		rt.area();
		rt.Tparameter();
		rt.Tarea();
		Shape s=new Shape();
		s.Sarea();
		s.Sparameter(3.14);
		
	}

}
