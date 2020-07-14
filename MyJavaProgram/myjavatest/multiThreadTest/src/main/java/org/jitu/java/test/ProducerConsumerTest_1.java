package org.jitu.java.test;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerTest_1 {
	public static void main(String[] args) throws InterruptedException {
		final BlockingQueue blockingQueue = new LinkedBlockingQueue();

		Thread producer = new Thread(new Runnable() {
			public void run() {
				try {
					Integer i = 0;
					while (true) {
						blockingQueue.put(i++);
						System.out.println("Producer " + i);
						// Thread.sleep(1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						int i = (Integer) blockingQueue.take();
						System.out.println("Consumer " + i);
						// Thread.sleep(1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		producer.start();
		Thread.sleep(100);
		consumer.start();
		Thread.sleep(100);
		//producer.join();
		//consumer.join();
	}
}
