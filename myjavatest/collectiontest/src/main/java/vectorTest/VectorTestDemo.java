package vectorTest;

import java.util.Vector;

public class VectorTestDemo {
    public static void main(String[] args) {
        Vector v=new Vector();

        v.add("One");
        v.add(1,"Two");
        v.addElement("Three");

        System.out.println(v);
    }
}
