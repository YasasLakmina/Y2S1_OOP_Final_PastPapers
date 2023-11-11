package November2022Threads;

import java.util.ArrayList;

public class ConsumerThread implements Runnable{
	private ArrayList<Integer> queue;
	private int counter = 0;
	
	public ConsumerThread(ArrayList<Integer> queue) {
		this.queue = queue;
	}
	
	public void run() {
				
			while(true) {	
				
				synchronized(queue) {
				System.out.println("Consumer Started");
				
				System.out.println("Consumer thread consumes 10");
				queue.remove(counter);
				
				System.out.println("Elments in the queue = " + queue);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				queue.notify();
				
				try {
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
	}
}
