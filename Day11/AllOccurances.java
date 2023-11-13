package Day11;
import java.util.Scanner;
public class AllOccurances {
	
		  public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    System.out.println("enter the string");
		    String str = sc.nextLine();
		    System.out.println("Enter the character");
		    char ch = sc.next().charAt(0);
		    AllOccurances(str,ch);
		  }
         public static void AllOccurances(String str,char ch){
                int count = 0;
                int n = str.length();
                for(int i=0; i<n; i++){
                 if(str.charAt(i)==ch){
                      count++;
                     }
                      }
                       System.out.println("All occurances: " +count);
                         }
                          }
