package overloading;

class A
{

}
 class B extends A
{

}
public class JavaOverloadingRefTest
{
    public void test(A a)
    {
        System.out.println("overloading.A");
    }
    public void test(B a)
    {
        System.out.println("overloading.B");
    }

    public static void main(String[] args) {
        JavaOverloadingRefTest t=new JavaOverloadingRefTest();
        A a=new A();

        B b=new B();

        A aa=new B();

        t.test(a);
        t.test(b);
        t.test(aa);


    }

}