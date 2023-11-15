package Day16;
import java.util.*;
public class Queueempty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Deque<Integer> deque = new ArrayDeque<>();
		 boolean empty= deque.isEmpty();
		 System.out.println("queue is empty "+ empty);
		 System.out.println("add element");
		 deque.addFirst(sc.nextInt());
		 System.out.println("add element");
		    deque.addLast(sc.nextInt());
		    System.out.println("add element");
		    deque.add(sc.nextInt());
		    int result =deque.peek();
		    System.out.println("peeked element is"+result);
		    int first = deque.removeFirst();
		    int last = deque.removeLast();
		    System.out.println(" removeFirst element: " + first + ",removing of Last : " + last);
		    boolean empt= deque.isEmpty();
			 System.out.println("queue is empty "+ empt);
		  }
	}

