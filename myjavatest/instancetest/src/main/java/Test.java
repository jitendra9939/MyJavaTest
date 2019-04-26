public class Test {
    static {
        System.out.println("java");
    }

    Test()
    {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Test t1=new Test();
    }
}
