package Day7;
import java.util.Scanner;
public class PowerofaNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a base");
		int base=sc.nextInt();//2
		System.out.println("enter a exponent");
		int exponent=sc.nextInt();//3
		power(base,exponent);
	}
    public static void power(int base,int exponent) {
    	int power=1;
    	 for (;exponent!= 0; --exponent)
         {
    		 power=power*base;//2*3=8
         }
         System.out.println(power);
    	
    }
}
//23=8