import java.util.LinkedList;

public class ProducerConsumerTest {
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
		consumer.start();
	}
}

class ProducerAndConsumer {
	private LinkedList list = new LinkedList();
	private int size = 10;
	int i = 0;

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (list.size() >= size) {
					this.wait();
				}
				list.add(i);
				System.out.println("Producer produce " + i);
				i++;
			   this.notify();
			   Thread.sleep(100);
			}
		}
	}

	public void consume() throws InterruptedException {

		while (true) {
			synchronized (this) {
				while (list.size() <= 0) {
					this.wait();
				}
				int value = (Integer) list.removeFirst();
				System.out.println("Consumer Consume " + value);
				this.notify();	
				Thread.sleep(100);
			}
		}
	}

}
