package linkedListTest;

import java.util.LinkedList;

public class LinkedListTestDemo {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("Java");
        ll.add(4);
        ll.add("Shiva");
        ll.add("Python");
        ll.add(null);

        System.out.println(ll);

        ll.remove(2);
        ll.add(null);
        ll.add(null);
        ll.set(0,"test");
        ll.set(0,"Zero");
        ll.removeLast();
        ll.addFirst("First");

        System.out.println(ll);


    }
}
