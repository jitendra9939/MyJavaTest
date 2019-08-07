package mapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTestDemo1 {

	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<Employee, String>();

		Employee emp1 = new Employee(new Integer(1001), "Amit");
		Employee emp2 = new Employee(new Integer(1002), "Jinu");
		Employee emp3 = new Employee(new Integer(1001), "Amit");

		map.put(emp1, "Delhi");
		map.put(emp2, "Mumbai");
		map.put(emp3, "Mumbai");

		for (Entry<Employee, String> map1 : map.entrySet()) {
			System.out.println(map1.getKey() + "  ==  " + map1.getValue() + " " + map1.hashCode());
		}
		System.out.println(map);

//		System.out.println(0.0/0.0);
//		System.out.println(-2/0.0);
//		System.out.println(2/0.0);
//		System.out.println(2/0);
	}

}
