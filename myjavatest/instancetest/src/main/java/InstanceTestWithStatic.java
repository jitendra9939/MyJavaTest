public class InstanceTestWithStatic {
    static {
        test("3");
    }

    String m = test("4");

    {
        m = test("2");
    }

    InstanceTestWithStatic() {
        m = test("1");
    }

    public static String test(String msg) {
        System.out.println(msg);
        return msg;
    }

    public static void main(String[] args) {
        InstanceTestWithStatic o = new InstanceTestWithStatic();
        System.out.println("main method");
    }
}
