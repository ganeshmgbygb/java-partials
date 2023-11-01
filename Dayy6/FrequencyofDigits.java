package Dayy6;
import java.util.Scanner;
public class FrequencyofDigits {

	public static void main(String[] args) {
		 int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count0=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(;n>0;n=n/10) {
			int r=n%10;
			if(r==1) {
				count1++;
			}else if(r==2) {
				count2++;
			}else if(r==3) {
				count3++;
			}else if(r==4) {
				count4++;
			}else if(r==5) {
				count5++;
			}else if(r==6) {
				count6++;
			}else if(r==7) {
				count7++;
			}else if(r==8) {
				count8++;
			}else if(r==9) {
				count9++;
			}else if(r==0) {
				count0++;
			
		}
		}
			System.out.println(count1+"1 is");
			System.out.println(count2+"2 is");
			System.out.println(count3+"3 is");
			System.out.println(count4+"4 is");
			System.out.println(count5+"5 is");
			System.out.println(count6+"6 is");
			System.out.println(count7+"7 is");
			System.out.println(count8+"8 is");
			System.out.println(count9+"9 is");
			System.out.println(count0+"0 is");

	

}
}
