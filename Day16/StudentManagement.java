package Day16;
import java.util.*;
class Student {
    private int rollNumber;
    private String name;
    private double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}
public  class StudentManagement {
    private ArrayList<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(int rollNumber, String name, double marks) {
        Student student = new Student(rollNumber, name, marks);
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int rollNumber) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getRollNumber() == rollNumber) {
                iterator.remove();
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found with the given roll number.");
    }

    public void searchStudent(int rollNumber) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student found! Details:");
                System.out.println("Roll Number: " + student.getRollNumber());
                System.out.println("Name: " + student.getName());
                System.out.println("Marks: " + student.getMarks());
                return;
            }
        }
        System.out.println("Student not found with the given roll number.");
    }
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("Details of all students:");
            for (Student student : studentList) {
                System.out.println("Roll Number: " + student.getRollNumber());
                System.out.println("Name: " + student.getName());
                System.out.println("Marks: " + student.getMarks());
                
            }
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        StudentManagement s = new StudentManagement();
        for(int i=0;i<4;i++) {
        s.addStudent(sc.nextInt(), sc.next(),sc.nextDouble());
        }
        System.out.println("Enter the student details");
        s.displayAllStudents();
       System.out.println("Search the student");
        s.searchStudent(sc.nextInt());
        System.out.println("Remove the student");
        s.removeStudent(sc.nextInt());
        s.displayAllStudents();
    }
}


