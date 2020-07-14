package org.jitu.java.threadtest.threaddemo;
public class DeadLockCondition {

	public static void main(String[] args) {
		Object noteBook=new Object();
		Object pen=new Object();
		
		new Thread(new WriterOne(noteBook, pen)).start();
		new Thread(new WriterTwo(noteBook, pen)).start();
		
		System.out.println("Main done !");
	}
}

class WriterOne implements Runnable {

	Object noteBook;
	Object pen;

	public WriterOne(Object noteBook, Object pen) {
		this.noteBook = noteBook;
		this.pen = pen;
	}

	// slove the deadlock same sequence of object locking
	public void run() {
		
		synchronized (noteBook) {
			System.out.println("WriterOne lock the noteBook !");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (pen) {
				System.out.println("WriterOne done the writing !");
			}

		}
	}
}

class WriterTwo implements Runnable {

	Object noteBook;
	Object pen;

	public WriterTwo(Object noteBook, Object pen) {
		this.noteBook = noteBook;
		this.pen = pen;
	}

	// slove the deadlock same sequence of object locking
	public void run() {
		
		// this is deadlocak condition
		/*synchronized (pen) {
			System.out.println("WriterTwo lock the pen !");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (noteBook) {
				System.out.println("WriterTwo done the writing !");
			}*/
		
		// slove the deadlock condition
		synchronized (noteBook) {
			System.out.println("WriterTwo lock the noteBook !");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (pen) {
				System.out.println("WriterTwo done the writing !");
			}

		}
	}
}
