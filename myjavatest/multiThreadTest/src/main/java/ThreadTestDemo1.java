
public class ThreadTestDemo1 {
    public static void main(String[] args)
    {
        Thread thread=new Thread(new Runner1());
        Thread thread1=new Thread(new Runner1());
        Thread thread2=new Thread(new Runner1());

        thread.start();
        thread2.start();


    }
}

class Runner1 implements Runnable
{

    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello Demo 2 "+i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
