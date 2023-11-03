package Day8;
import java.util.Scanner;
public class SumandAverage {

	 public static void main(String args[]) {
		 int i;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the sixe of array");
	        int n = sc.nextInt();
	        int array[] = new int[n];
	        System.out.println("Enter the array of items");
	        for ( i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }
	        sumandavg(n,array);

}
	 public static void sumandavg(int n,int array[]) {
		 
		 int sum=0;
		 for(int i=0;i<n;i++) {
			 sum=sum+array[i];
		 }
		 
		double avg=sum/n;
		 System.out.println(avg);
		
		 
	 }
}
