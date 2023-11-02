package Day7;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Fibonacci(n);
	}
	public static void Fibonacci(int n) {
		 int firstTerm = 0, secondTerm = 1;
	    
		 int i = 1;
	   while ( i <= n ) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	      ++i;
	    }
	}

}
