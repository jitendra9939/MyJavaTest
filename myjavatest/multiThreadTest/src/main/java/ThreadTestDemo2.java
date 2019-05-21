public class ThreadTestDemo2 implements Runnable{

    public void run()
    {
        for(int i=0;i<10;i++)
        {
          try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Test "+i);
        }
    }
    public static void main(String[] args) {

        Thread t1=new Thread(new ThreadTestDemo2());
        Thread t2=new Thread(new ThreadTestDemo2());
        Thread t3=new Thread(new ThreadTestDemo2());
        Thread t4=new Thread(new ThreadTestDemo2());
        Thread t5=new Thread(new ThreadTestDemo2());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }


}
