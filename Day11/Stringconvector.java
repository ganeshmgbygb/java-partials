package Day11;
import java.util.Scanner;
public class Stringconvector {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String Str =sc.nextLine() ;
        System.out.println("Input: " + Str);
        Converter(Str);
	}
	public static void Converter(String Str) {
        char[] chArray = Str.toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            char currentCh = chArray[i];

            if (Character.isUpperCase(currentCh)) {
                chArray[i] = Character.toLowerCase(currentCh);
            } else if (Character.isLowerCase(currentCh)) {
                chArray[i] = Character.toUpperCase(currentCh);
            }
            
        }

        String Str1 = new String(chArray);
        System.out.println("Output: " + Str1);
    }

	}


