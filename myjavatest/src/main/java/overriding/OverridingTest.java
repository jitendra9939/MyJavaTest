package overriding;

public class OverridingTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pp = new Child();

        p.marry();
        c.marry();
        pp.marry();
    }
}

class Parent {
    public void property() {
        System.out.println("cash, land, glold etc..");
    }

    public void marry() {
        System.out.println("parent decision");
    }
}

class Child extends Parent {
    public void marry() {
        System.out.println("Child decision");
    }
}
