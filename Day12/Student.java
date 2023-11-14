package Day12;
import java.util.Scanner;
public class Student {
	int ID,marks1,marks2,marks3;
	String name;
	Student(int id,String namee,int sub1,int sub2,int sub3)
	{
		System.out.println("Details...");
		ID=id;
		name=namee;
	    marks1=sub1;
	    marks2=sub2;
	    marks3=sub3;
		
	}
	public void Print()
	{
		System.out.println("The Student Id  is "+ID);
		System.out.println("The Student Name is "+name);
		System.out.println("The Marks are "+marks1+" "+marks2+" "+marks3);
	}
}
class Student_Information_System
{
	public static void main(String args[])
	{
		Student s[]=new Student[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student(sc.nextInt(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		for(int i=0;i<s.length;i++)
		{
		  	s[i].Print();
		}
	
	
	
	}
}

