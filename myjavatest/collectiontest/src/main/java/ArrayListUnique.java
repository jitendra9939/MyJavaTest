import java.util.ArrayList;

public class ArrayListUnique {
    public static void main(String[] args) {
        ArrayList employeeList = new ArrayList();

        employeeList.add("Mohan");
        employeeList.add("Shayam");
        employeeList.add("Sonali");

        ArrayList employeeListNew = new ArrayList();
        employeeListNew.add("Mohan");
        employeeListNew.add("Shayam");
        employeeListNew.add("xyz");

        System.out.println("////////////////////////////////////// 1");
        System.out.println(employeeListNew);

        employeeListNew.addAll(employeeList);
        System.out.println("////////////////////////////////////// 2");
        System.out.println(employeeListNew);

        employeeListNew.retainAll(employeeList);

        System.out.println("////////////////////////////////////// 3");
        System.out.println(employeeListNew);

        for (Object value : employeeListNew) {
            employeeList.add("456");
            employeeList.remove(value);
        }
        System.out.println(employeeListNew);

        System.out.println(employeeList);
       /* System.out.println("Remove All " + employeeList.retainAll(employeeList));
        ArrayList employeeListUnique = new ArrayList();
        System.out.println("Find Unique list using for loop/////////////////////////////////////////////////////////////////");
        for (Object emp : employeeList) {
            if (!employeeListUnique.contains(emp)) {
                employeeListUnique.add(emp);
            }
            System.out.println(emp);
        }
        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("Unique List");
        for (Object emp : employeeListUnique) {
            System.out.println(emp);
        }
        employeeListUnique.clear();

        System.out.println("Find Unique list using for HasSet/////////////////////////////////////////////////////////////////");
        employeeListUnique = new ArrayList(new HashSet(employeeList));
        System.out.println("Unique List");
        for (Object emp : employeeListUnique) {
            System.out.println(emp);
        }

        employeeListUnique.clear();

        System.out.println("Find Unique list using for LinkedHashSet/////////////////////////////////////////////////////////////////");
        employeeListUnique = new ArrayList(new LinkedHashSet(employeeList));
        System.out.println("Unique List");
        for (Object emp : employeeListUnique) {
            System.out.println(emp);
        }
*/

    }
}
