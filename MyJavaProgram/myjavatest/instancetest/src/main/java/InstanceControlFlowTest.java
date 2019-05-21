public class InstanceControlFlowTest {
    int x = 10;
    int y = 20;

    {
        test();
        System.out.println(x);
    }

    InstanceControlFlowTest() {
        System.out.println("parent constructor");
    }

    public static void main(String[] args) {
        InstanceControlFlowTest instanceControlFlowTest = new InstanceControlFlowTest();
        System.out.println("parent main");
    }

    void test() {
        System.out.println(y);
    }
}

class InstanceControlFlowTestChild extends InstanceControlFlowTest {
    int z = 15;

    {
        System.out.println(z);
    }

    public static void main(String[] args) {
        //InstanceControlFlowTestChild instanceControlFlowTestChild=new InstanceControlFlowTestChild();
        System.out.println("Child main");
    }
}