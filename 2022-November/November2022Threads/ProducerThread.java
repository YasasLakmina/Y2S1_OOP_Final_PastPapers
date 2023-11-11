package November2022Threads;

import java.util.ArrayList;

public class ProducerThread implements Runnable{
	
	private ArrayList<Integer>  queue;
	private int counter = 0;
	
	public ProducerThread(ArrayList<Integer> queue) {
		this.queue = queue;
	}
	
	public void run() {
		
			while(true) {
				
				synchronized(queue) {
				System.out.println("Producer Started");
				
				System.out.println("Producer adding value = " + (counter+10) + " to Queue");
				queue.add(counter+10);
				
				counter = counter + 10;
				
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
