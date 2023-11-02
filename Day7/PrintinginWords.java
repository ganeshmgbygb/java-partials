package Day7;
import java.util.Scanner;
public class PrintinginWords {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a positive integer ");
        int number = sc.nextInt();
		while (number>0) {
            if (number < 0) {
                System.out.println("Please enter a positive integer.");
                continue;
            }
             convertNumberToWords(number);
        }
    }

    public static void convertNumberToWords(int number) {
        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        if (number >= 0 && number <= 9) {
            System.out.println(words);
        } else {
            System.out.println ("Number out of range (0-9)");
        }
	}

}
