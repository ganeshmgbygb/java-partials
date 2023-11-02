package Day7;
import java.util.Scanner;
public class FindingFactors {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		factors(n);
	}
	public static void factors(int n) {
		int factor=1;
		while(factor<=n) {
			if(n%factor==0) {
				
				System.out.println(factor);
			}
			factor++;
		}
			
	}
	

}
