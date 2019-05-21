package iteratorTest;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTestDemo {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        for(int i=0;i<10;i++)
        {
            al.add(i);
        }

        Iterator itr= al.iterator();
        System.out.println("Array List "+al);
        while (itr.hasNext())
        {
            Integer i=(Integer)itr.next();
            if(i%2==0)
            {
                System.out.println("Even no "+i);
            }
            else
            {
                itr.remove();
            }
        }
        System.out.println("Array List "+al);
    }
}
