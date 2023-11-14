package Day12;
import java.util.Scanner;
 class EmployeeHierarchyTest{
	private int id;
	private int salary;
	private String name;
	public EmployeeHierarchyTest(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void bouns(int salary) {
		if(salary<=10000) {
			int sal=salary+10000;
			System.out.println("your bonus is"+sal);
		}else if(salary>=20000) {
			int sal=salary+20000;
			System.out.println("your salary is"+sal);
			
		}else {
			System.out.println("your not a employ");
		}
	}
}
 class engineers extends EmployeeHierarchyTest{
	 public engineers(int id,String name) { 
		super(id,name);
		
	 }
	 public void Bouns(int salary) {
		 if(salary>=40000) {
				int sal=salary+10000;
				System.out.println("your bonus is"+sal);
			}else if(salary>=50000) {
				int sal=salary+20000;
				System.out.println("your salary is"+sal);
				
			}else {
				System.out.println("your not a employ");
			}
		}
	 }
	 
public class EmployeeHierarchy {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		
		EmployeeHierarchyTest[] et=new EmployeeHierarchyTest[1];
		for(int i=0;i<et.length;i++) {
			System.out.println("enter the id,name");
			et[i]=new engineers(sc.nextInt(),sc.next());
			System.out.println("Enter the salary");
			et[i].bouns(sc.nextInt());
		}
		System.out.println("enter the id,salart,name");
		engineers en=new engineers(sc.nextInt(),sc.next());
		System.out.println("Enter the salary");
		en.Bouns(sc.nextInt());
		
		}

}
