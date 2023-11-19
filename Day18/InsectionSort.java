package Day18;
import java.util.Scanner;
public class InsectionSort {

	public static void main(String[] args) {
		int j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++) {
        	int key=array[i];
        	 j= i-1;
        
        while(j>=0 && array[j]>key) {
        	array[j+1]=array[j];
        	j--;
        }
         array[j+1]=key;
	}
        System.out.println("After Insertion Sort");    
        for(int num:array) {
        	System.out.println(num);
        }

}
}
