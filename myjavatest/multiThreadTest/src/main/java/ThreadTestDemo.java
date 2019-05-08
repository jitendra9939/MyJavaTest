
public class ThreadTestDemo {
    public static void main(String[] args) {
        Runner runner1=new Runner();
        Runner runner2=new Runner();
        Runner runner3=new Runner();
        runner1.start();
        runner2.start();
        runner3.start();

    }
}

class Runner extends Thread
{

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello "+i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
