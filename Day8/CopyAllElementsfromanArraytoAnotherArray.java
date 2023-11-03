package Day8;
import java.util.Scanner;
public class CopyAllElementsfromanArraytoAnotherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        int arr[]=new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            arr[i]=array[i];

	}
        Copyelement(n,array,arr);
}
	public static void Copyelement(int n,int array[],int arr[]) {
		int i;
		System.out.println("original array");
		for (i = 0; i < n; i++) {
			System.out.println(array[i]);
	}
		System.out.println("copied array");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
}
}
