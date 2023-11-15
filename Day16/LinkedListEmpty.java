package Day16;
import java.util.*;
public class LinkedListEmpty {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> c = new LinkedList<String>();
	boolean result=c.isEmpty();
	System.out.println("linked listed is empty"+result);
	System.out.println("Enter a data into linked list");
	c.add(sc.nextLine());
	System.out.println("Enter the data to add ");
	c.add(sc.nextLine());
	System.out.println("Enter the data to add ");
	c.addFirst(sc.nextLine());
	System.out.println("Enter the data to add ");
	c.addLast(sc.nextLine());
	System.out.println(" the  element in linked list are"+c);
	c.remove();
	System.out.println(" the removeing element in linked list are"+c);
	c.removeFirst();
	System.out.println(" the removeing Firstelement in linked list are"+c);
	System.out.println("Enter the data to add ");
	c.add(sc.nextLine());
	c.getFirst();
	System.out.println("get the firstdata is "+c);
	c.getLast();
	System.out.println("get the Lastdata is "+c);
	boolean resul=c.isEmpty();
	System.out.println("enter the String to search ");
	System.out.println("linked listed is empty"+resul);
	int index = Collections.binarySearch(c,sc.nextLine());
    System.out.println(index);
}
}
