package Day7;
import java.util.Scanner;
public class FactorialCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Calculation(n);

	}
	public static void Calculation(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
			System.out.println(fact);
		}
		
	}

}
