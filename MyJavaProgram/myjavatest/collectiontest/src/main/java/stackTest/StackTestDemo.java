package stackTest;

import java.util.Stack;

public class StackTestDemo {
    public static void main(String[] args) {
        Stack s= new Stack();

        s.push("One");
        s.push("Two");
        s.push("Three");
        s.push("Four");

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search("One"));
        System.out.println(s.search("Five"));

    }
}
