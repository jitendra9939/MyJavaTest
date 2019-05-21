import java.util.LinkedList;

public class ProducerConsumerTest {
    private static LinkedList list = new LinkedList();

    public static void main(String[] args) throws InterruptedException {
        final ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();
        Thread producer = new Thread(new Runnable() {
            public void run() {
                try {
                    producerAndConsumer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            public void run() {
                try {
                    producerAndConsumer.consume();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        producer.sleep(5000);
        consumer.start();
        consumer.sleep(5000);
    }
}


class ProducerAndConsumer {
    private LinkedList list = new LinkedList();
    private int size = 2;

    public void produce() throws InterruptedException {

        int i = 0;
        while (true) {
            synchronized (ProducerConsumerTest.class) {
                while (list.size() >= 2) {
                    wait();
                }
                list.add(i);
                System.out.println("Producer produce " + i);
                i++;

                notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        while (true) {
            synchronized (ProducerConsumerTest.class) {
                while (list.size() <= 0) {
                        wait();
                    }
                    int value = (Integer) list.removeFirst();
                    System.out.println("Consumer Consume " + value);
                    notify();
                }
            }

        }

    }




