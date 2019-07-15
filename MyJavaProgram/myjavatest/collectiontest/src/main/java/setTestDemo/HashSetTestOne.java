package setTestDemo;

import java.util.HashSet;

public class HashSetTestOne {

	public static void main(String[] args) {
		HashSet h= new HashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add(null);
		h.add("E");
		
		System.out.println(h.add("A"));
		System.out.println(h);

	}

}
