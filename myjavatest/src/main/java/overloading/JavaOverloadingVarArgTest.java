package overloading;

public class JavaOverloadingVarArgTest {
    public static void main(String[] args) {
        JavaOverloadingVarArgTest t = new JavaOverloadingVarArgTest();
        t.test(10);
        t.test();
        t.test(10, 20);
        t.test(10L);
    }


    public void test(int... i) {
        System.out.println("Var arg Method " + i);
    }

    public void test(int i) {
        System.out.println("Regular Method " + i);
    }

    public void test(float f) {
        System.out.println("float " + f);
    }


}
