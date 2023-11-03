package Day8;
import java.util.Scanner;
public class CountFrequencyofEachElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
	}
        CountFrequency(n,x);
	}
	public static void CountFrequency(int n,int x[]) {
		System.out.println("frequency of each element");
		boolean visited[]=new boolean[n];
        for (int m=0;m<n;m++) {
        visited[m]=false;
        }
        for(int i=0;i<n;i++) {
            if (visited[i]==true)
            continue;
            int count =1;
            for(int j=i+1;j<n;j++) {
                if(x[i]==x[j]) {
                    visited[j] = true;
                    count++;
                    
                }
              
            }
            
            System.out.println(x[i]+"==="+count);
	}
       
}
}
