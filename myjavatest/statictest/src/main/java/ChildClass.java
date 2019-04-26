public class ChildClass extends ParentClass {

    static int k=10;
    static
    {
        m2();
        System.out.println("Child First Static Block");
        System.out.println(k);
    }

    public static void main(String[] args)
    {
        m2();
        System.out.println("Child Main Method");
    }
    public static void m2()
    {
        System.out.println(l);
    }
    static
    {
        System.out.println("Child Second Static Block");
    }
    static int l=20;
}
