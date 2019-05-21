public class ParentClass {

    static int x = 10;
    static int j = 20;

    static {
        m1();
        System.out.println("Parent First Static Block");
        System.out.println(x);
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Parent Main Method");
    }

    public static void m1() {
        System.out.println(j);
    }
}
