package overriding;

public class OverridingCovarientReturnTest {

    public static void main(String[] args) {
        ParentTest p = new ParentTest();
        ChildTest c = new ChildTest();
        ParentTest pp = new ChildTest();

        p.test();
        c.test();
        pp.test();
    }
}

class ParentTest {
    public Object test() {
        System.out.println("ParentTest");
        return null;
    }
}

class ChildTest extends ParentTest {
    public Float test() {
        System.out.println("ChildTest");
        return null;
    }
}
