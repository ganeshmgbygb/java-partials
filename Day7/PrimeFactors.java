package Day7;
import java.util.Scanner;
public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
	}
	public static void Factor(int n) {
		int divisor = 2;
        while (n > 1) {
            if (n % divisor == 0) {
                System.out.print(divisor + " ");
                n = divisor;
            } else {
                divisor++;
            }
        }
	}

}
