package arraylist_DS;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
public class queue {
	




		public static void main(String[] args) {
//			PriorityQueue<String>pq=new PriorityQueue<>();
//			pq.add("2");
//			pq.add("4");
//			System.out.print(pq.peek() + " ");
//			pq.offer("1");
//			pq.add("3");
//			pq.remove("1");
//			System.out.print(pq.poll() + " ");
//			if(pq.remove("2"))
//			System.out.print(pq.poll() + " ");
//			System.out.print(pq.poll() + " " + pq.peek() + " ");
//			
//			ArrayDeque<String> ad = new ArrayDeque<>();
//			ad.add("2");    
//			ad.add("4");
//			System.out.print(ad.peek() + " ");
//			ad.offer("1");   
//			ad.add("3");   
//			ad.remove();
//			System.out.print(ad.poll() + " ");
//			if(ad.peek().equals("2"))
//			   System.out.print(ad.poll() + " ");
//			System.out.print(ad.poll() + "  " + ad.peek() + " ");
			
//			ArrayDeque<String> ad = new ArrayDeque<>();
//			ad.add("2");    
//			ad.add("4");
//			ad.push("3");
//			ad.pop();
//			ad.offer("1");   
//			ad.add("3");  
//			System.out.print(ad.pollFirst());
//			System.out.print(ad.pollLast());
//			System.out.print(ad.remove());
//			System.out.print(ad.peek());
//			System.out.print(ad.poll());
			
//			ArrayDeque<String> deque = new ArrayDeque<>();
//			deque.add(null);
//			deque.add("Hello");
//			deque.add(null);
			ArrayDeque<String> ad = new ArrayDeque<>();
			ad.push("Ram");
			ad.push("Sita");
			ad.push("Devi");
			ad.pop();
			ad.peek();
			while(ad.peek()!=null)
			 System.out.print(ad.pop());
		}

	}


