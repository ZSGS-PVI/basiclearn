package arraylist_DS;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(101, "ramesh");
		m.put(102, "suresh");
		m.put("ak","ganesh");
		System.out.println(m);
		
		
//		HashMap h=new HashMap();
//		h.put(1,null);
//		h.put(null,"hi");
//		h.put(null,null);
//		h.put(2,null);
//		System.out.println(h.size());
		
		Map<Integer,Integer> h=new HashMap<>(10);
		for(int i=1;i<=10;i++)
		   h.put(i,i*i);
		System.out.println(h.get(5));
		
//		Map h=new HashMap();
//		h.put(1, "Hi");
//		h.put("hello", "Hi");
//		System.out.println(h.contains("1"));
		Map h1=new HashMap(10);
		System.out.println(h1.get(50));
		
	}
}
