public class InstanceControlTest {
    int i = 10;
    int j = 20;

    {
        m1();
        System.out.println("First Instance Block");
    }

    {
        System.out.println("Constructor");
    }

    {
        System.out.println("Second Instance Block");
    }

    public static void main(String[] args) {
        InstanceControlTest instanceControlTest = new InstanceControlTest();
        System.out.println("Main Method");

    }

    public void m1() {
        System.out.println(j);
    }
}
