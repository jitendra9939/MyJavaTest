package setTest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTestDemo {
    public static void main(String[] args) {
        Set<String> setTest=new HashSet<String>();
        setTest.add("test1");
        setTest.add("test2");
        setTest.add("test2dgjfbdjf");
        setTest.add("test3");
        setTest.add("test4");
        setTest.add("test5");
        System.out.println(setTest);

        Set<String> treeSet= new TreeSet<String>(setTest);

        System.out.println(treeSet);

    }

}
