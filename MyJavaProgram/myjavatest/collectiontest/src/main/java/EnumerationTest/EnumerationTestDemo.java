package EnumerationTest;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTestDemo {

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
            System.out.println(e.nextElement());
            //System.out.println(e.nextElement());
            //System.out.println(e.nextElement());
            //System.out.println(e.nextElement());
            /*Integer i = (Integer) e.nextElement();
            if (i % 2 == 0) {
                System.out.println("Even Number" + i);
            }
*/
        }

    }
}
