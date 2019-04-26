public class MyThreadOneMain {
    public static void main(String[] args) {
        MyThread myThread =new MyThread();

        Thread t=new Thread(myThread);
        t.start();



    }

}
