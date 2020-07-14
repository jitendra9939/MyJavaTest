package org.jitu.java.test;
public class ThreadTestJoin implements Runnable {

    public void run() {
        System.out.println("Run");
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadTestJoin());
        Thread t2 = new Thread(new ThreadTestJoin());
        Thread t3 = new Thread(new ThreadTestJoin());
        t1.start();

        try {
            t1.join();
            System.out.println("Join");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Join End");
        t3.start();
        t2.start();
        System.out.println("End Process");
    }
}
