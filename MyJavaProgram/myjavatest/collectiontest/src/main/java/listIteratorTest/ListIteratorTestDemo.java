package listIteratorTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTestDemo {
    public static void main(String[] args) {
        List l=new ArrayList();
        for(int i=0;i<=10;i++)
        {
            l.add(i);
        }
        ListIterator ltr= l.listIterator();
        System.out.println("List "+l);
        while (ltr.hasNext())
        {
            Integer i=(Integer)ltr.next();
            if(i.equals(2))
            {
                ltr.remove();
            }
            else if(i.equals(5))
            {
                ltr.add(22);
            }
            if(i.equals(7))
            {
                ltr.set(77);
            }
        }

        System.out.println("List "+l);
    }
}
