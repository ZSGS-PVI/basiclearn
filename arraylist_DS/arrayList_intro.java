package arraylist_DS;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class arrayList_intro {

	public static void main(String[] args) {

		Set<Integer> list=new TreeSet<>();
		// List<Integer> l =Arrays.asList(10,4,-1,5);
		//System.out.println(list.capa);
		
		list.add(23);

		list.add(23);

		list.add(45);

		list.add(56);

		list.add(23);

		list.add(78);

		list.add(90);
		System.out.println(list);
		
//			Collections.sort(l);
//			Integer array[]=l.toArray(new Integer[4]);
//			System.out.println(array[0]);
		
//		 List<Integer> l=new ArrayList<Integer>();
//			l.add(2);
//			l.add(7);
//			l.add(null);
//			for(int x: l)
//			System.out.println(x);null exception is thrown
		Stack<Integer> s=new Stack<Integer>();
		
			
			Stack<Integer> stack = new Stack<Integer>();
			int n = 12;
			while (n > 0){
			stack.push(n%2);
			n = n/2; }
			String result ="";
			
			Integer results=0;
			while (!stack.isEmpty())
			results += stack.pop();
			System.out.println(result);
		
//		 ArrayList l1=new ArrayList(10);
//			l1.add(2);
//			ArrayList l2=new ArrayList(10);
//			l2.add(2);
//			if(l1==l2)
//			   System.out.println("A");
//			else if(l1.equals(l2))
//				System.out.println("B");
//			else
//				System.out.println("C");
//		
//		System.out.println(list);
	}

}
