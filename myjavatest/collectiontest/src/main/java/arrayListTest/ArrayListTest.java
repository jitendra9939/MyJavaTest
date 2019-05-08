package arrayListTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList employeeList = new ArrayList();
        employeeList.add("Mohan");
        employeeList.add("Shayam");
        employeeList.add("Madhu");
        employeeList.add("Sonali");
        employeeList.add("Mayank");
        employeeList.add("Radha");
        employeeList.add(4);

        employeeList.add(3, "newElement");

        employeeList.set(1, 321);

        //System.out.println(employeeList);
        //employeeList.removeAll(employeeList);

        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Using foreach loop");
        for (Object emp : employeeList) {
            System.out.println(emp.toString());
        }

        System.out.println("Size" + employeeList.size());
        //employeeList.clear();
        //employeeList.removeAll(employeeList);
        System.out.println("Size" + employeeList.size());

        ArrayList employeeListOther = new ArrayList();
        employeeListOther.add("Mohan");
        employeeListOther.add("Shayam");
        employeeListOther.add("Madhu");
        employeeListOther.add("Sonali");
        employeeListOther.add("Mayank");
        employeeListOther.add("Radha");
        employeeListOther.add("xyz");
        employeeListOther.add("abc");
        employeeListOther.add(44);

        employeeList.addAll(employeeListOther);
        //employeeList.removeAll(employeeListOther);

        employeeList.retainAll(employeeListOther);
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Size" + employeeList.size());
        System.out.println("Using Iterator");
        Iterator iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Index of Radha" + employeeList.indexOf("Radha"));

    }
}
