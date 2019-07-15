package setTestDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkestHashSetOne {

	public static void main(String[] args) {

		LinkedHashSet h= new LinkedHashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add(10);
		h.add(null);
		h.add("E");
		
		System.out.println(h.add("A"));
		System.out.println(h);
	}

}
