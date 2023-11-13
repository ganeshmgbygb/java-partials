package Day11;
import java.util.Scanner;
public class HighFrequency {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String str = sc.nextLine();
    HighFrequency(str);
}
	 public static void HighFrequency(String str) {
		    int high = 0;
		    char ch =' ';
		    for(int i=0;i<str.length();i++) {
		      int count = 0;
		      for(int j=0;j<str.length();j++) {
		        if(str.charAt(i)==str.charAt(j)) {
		          count++;
		        }
		      }
		      if(count>high) {
		        high = count;
		        ch=str.charAt(i);
		      }
		    }
		    System.out.println("highfrequency:" + ch); 
		  }
		  
}
