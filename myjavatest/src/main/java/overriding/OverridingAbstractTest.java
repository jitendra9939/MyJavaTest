package overriding;

public class OverridingAbstractTest {
}

abstract class Parent1 {
    public abstract void test();
    }

class Child1 extends Parent1 {
   public void test()
   {
       System.out.println("Abstract class to non abstract class");
   }
}