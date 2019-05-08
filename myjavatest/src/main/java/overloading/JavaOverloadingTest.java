package overloading;

public class JavaOverloadingTest {
    public void test(Object o) {
        System.out.println("Object" + o);
    }

    public void test(String s) {
        System.out.println("String " + s);
    }


    public void test(StringBuilder sbl) {
        System.out.println("StringBuilder " + sbl);
    }

    public void test(StringBuffer sb) {
        System.out.println("StringBuffer " + sb);
    }


    public static void main(String[] args) {
        JavaOverloadingTest t = new JavaOverloadingTest();
        t.test(new Object());
        t.test("abc");
        t.test(new StringBuffer("testStringBuffer"));
        t.test(new StringBuilder("testStringBuilder"));
        //t.test(null);
    }
}
