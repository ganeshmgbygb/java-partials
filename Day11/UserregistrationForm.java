package Day11;
import java.util.Scanner;
import java.util.regex.*;
public class UserregistrationForm {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Email Verifier");
            System.out.println("2. Username and Password Verifier");
            System.out.println("3. Mobile Number Verifier");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter email address: ");
                    String email = scanner.nextLine();
                    if (isValidEmail(email)) {
                        System.out.println("Valid email address");
                    } else {
                        System.out.println("Invalid email address");
                    }
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    if (isValidUsernameAndPassword(username, password)) {
                        System.out.println("Valid username and password");
                    } else {
                        System.out.println("Invalid username or password");
                    }
                    break;
                case 3:
                    System.out.print("Enter mobile number: ");
                    String phoneNumber = scanner.nextLine();
                    if (isValidPhoneNumber(phoneNumber)) {
                        System.out.println("Valid mobile number");
                    } else {
                        System.out.println("Invalid mobile number");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    public static boolean isValidEmail(String email) {
         email = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        
        return true;
    }
    public static boolean isValidUsernameAndPassword(String username, String password) {
        password="^[A-Za-z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        return !username.isEmpty() && !password.isEmpty();
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
         phoneNumber = "^[6-9]\\d{9}$";
       
        return true;
    }
}
	      
	   
	

	


