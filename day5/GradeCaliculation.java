package day5;
import java.util.Scanner;
public class GradeCaliculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of a stubdent");
		int marks=sc.nextInt();
		GradeCaliculation gc=new GradeCaliculation();
		gc. Grade(marks);
	}
	public void Grade(int marks) {
		if(marks>85&&marks<100) {
			System.out.println("Grade A");
		}else if(marks>65&&marks<85) {
			System.out.println("Grade B");
		}else if(marks>55&&marks<65) {
			System.out.println("Grade c");
		}else {
			System.out.println("fail");
			
		}
	}

}
