package Day16;
import java.util.Scanner;
import java.util.Stack;
public class StackEmpty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Stack<String>s=new Stack<String>();
		boolean resul = (s.empty());  
		System.out.println("Is the stack empty? " + resul);
		System.out.println("enter String to push");
		s.push(sc.nextLine());
		s.push(sc.nextLine());  
		s.push(sc.nextLine());
		System.out.println("Elements in Stack: " + s);
		s.pop();
		System.out.println("Elements in Stack: " + s);  
		s.push(sc.nextLine());
		s.push(sc.nextLine());
		System.out.println("Elements in Stack: " + s); 
		s.pop();
		System.out.println("Elements in Stack: " + s);
		boolean result = (s.empty());  
		System.out.println("Is the stack empty? " + result);
		String fruits = s.peek();  
		System.out.println("Element at top: " + fruits);  
		

	}

	

}
