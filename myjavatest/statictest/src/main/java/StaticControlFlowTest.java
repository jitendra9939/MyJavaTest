public class StaticControlFlowTest {

    static int a=10;
    static
    {
        test();
        System.out.println("First parent Static Block a="+a);
    }

    public static void main(String[] args)
    {
        System.out.println("Parent Class");
        System.out.println("value main of a="+a);
        System.out.println("value main of b="+b);
    }

    static void test()
    {
        System.out.println("value method of b="+b);
    }

    static int b=5;
}

class StaticControlFlowTestChild extends StaticControlFlowTest
{
    static int x=15;
    static
    {
        test2();
        System.out.println("First child Static Block x="+x);
    }

    public static void main(String[] args) {
        System.out.println("Child Class");
        System.out.println("value main of x="+x);
        System.out.println("value main of y="+y);
    }

    static void test2()
    {
        System.out.println("value method of y="+y);
    }
    static int y=20;
}
