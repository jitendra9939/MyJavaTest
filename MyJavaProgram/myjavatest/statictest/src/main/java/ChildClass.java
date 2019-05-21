public class ChildClass extends ParentClass {

    static int a = 10;
    static int b = 20;

    static {
        m2();
        System.out.println("Child First Static Block");
        System.out.println(a);
    }

    static {
        System.out.println("Child Second Static Block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Child Main Method");
    }

    public static void m2() {
        System.out.println(b);
    }
}
