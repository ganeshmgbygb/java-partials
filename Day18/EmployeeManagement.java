package Day18;
import java.util.*;
class Employee{
	    private int employeeId;
	    private String name;
	    private double salary;
public Employee(int employeeId, String name, double salary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.salary = salary;
	    }
public int getEmployeeId() {
    return employeeId;
}

public String getName() {
    return name;
}

public double getSalary() {
    return salary;
}
public String toString() {
    return "Employee ID: " + employeeId + ", Name: " + name + ", Salary: " + salary;
}
}

public class EmployeeManagement {

	 HashSet<Employee>employees=new HashSet<Employee>();
	 public void addEmployee(Employee name) {
	        employees.add(name);
	    }
	 public void removeEmployee(int employeeId) {
	        Iterator<Employee> iterator = employees.iterator();
	        while (iterator.hasNext()) {
	            Employee employee = iterator.next();
	            if (employee.getEmployeeId() == employeeId) {///id 1==1
	            	
	                iterator.remove();
	                System.out.println("Employee with ID " + employeeId + " removed successfully.");
	                return;
	            }
	        }
	        System.out.println("Employee with ID " + employeeId + " not found.");
	    }
	 public void displayAllEmployees() {
		
	        System.out.println("Employee Details:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }
	 public void searchEmployee(int employeeId) {
	        for (Employee employee : employees) {
	            if (employee.getEmployeeId() == employeeId) {
	                System.out.println("Employee found:\n" + employee);
	                //return;
	            }
	        }
	        System.out.println("Employee with ID " + employeeId + " not found.");
	    }
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 EmployeeManagement em=new EmployeeManagement();
		 for(int i=0;i<2;i++) {
			 System.out.println("Enter a id,name,salary");
			 em.addEmployee(new Employee(sc.nextInt(), sc.next(),sc.nextInt()));
		 }
		 System.out.println("display all employees");
		 em.displayAllEmployees();
		 System.out.println(" removing an employees");
		 em.removeEmployee(sc.nextInt());
		 System.out.println("display all employees");
		 em.displayAllEmployees();
		 System.out.println("search an employees");
		 em.searchEmployee(sc.nextInt());
	 }
	 
}
