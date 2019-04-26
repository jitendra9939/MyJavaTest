public class ParentClass {

    static int i=10;
    static
    {
        m1();
        System.out.println("Parent First Static Block");
        System.out.println(i);
    }

    public static void main(String[] args)
    {
        m1();
        System.out.println("Parent Main Method");
    }
    public static void m1()
    {
        System.out.println(j);
    }
    static int j=20;
}
