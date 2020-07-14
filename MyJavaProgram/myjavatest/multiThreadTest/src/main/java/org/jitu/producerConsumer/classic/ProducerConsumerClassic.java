package org.jitu.producerConsumer.classic;

import java.util.LinkedList;

public class ProducerConsumerClassic {
	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private Integer size = 5;
	

	public static void main(String args[]) throws InterruptedException {
		final ProducerConsumerClassic object = new ProducerConsumerClassic();
	
		Thread producerThread = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("Producer");
					object.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread consumerThread = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("consumer");
					object.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		producerThread.start();
		consumerThread.start();
		
		//producerThread.join();
		//consumerThread.join();
		
	}
	
	
	public void producer() throws InterruptedException {
		Integer value = 0;

		while (true) {
			synchronized (this) {
				if (list.size() > size) {
					wait();
				}
				System.out.println("Add "+value);
				list.add(value);
				value++;
				notify();
				Thread.sleep(500);
			}

		}
	}
	
	public void consumer() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (list.size() == 0) {
					wait();
				}
				System.out.println("Value " + list.removeFirst());
				notify();
				Thread.sleep(500);
			}

		}
	}

}

