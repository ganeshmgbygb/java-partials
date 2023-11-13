package Day11;
import java.util.Scanner;
public class LowFrequency {
	
	 public static void main(String args[]) {
         Scanner sc=new Scanner (System.in);
     System.out.println("Enter the String");
     String str = sc.nextLine();
     
   
  creat( str);
   }
     public static void creat(String str){
     int n = str.length();
     boolean visted[]=new boolean[n];
     for(int m=0;m<n;m++){
         visted[m]=false;
     }
     System.out.println("charter\tcount");
     for(int i=0;i<n;i++){
         if(visted[i]==true)
         continue;
         int count =1;
         for(int j=i+1;j<n;j++){
             if(str.charAt(i)==str.charAt(j)){
                 visted[j]=true;
                 count++;
             }
            
         }
         if(count==1)
        	 System.out.println(str.charAt(i)+"\t"+count);
         
     }
}
	}

