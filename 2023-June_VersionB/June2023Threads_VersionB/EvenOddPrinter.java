package June2023Threads_VersionB;

public class EvenOddPrinter {
	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 1;
	private static final Object lock = new Object();
	
	public static void main(String[] args) {
		Thread evenThread = new Thread(new EvenRunnable() , "EvenThread");
		Thread oddThread = new Thread(new OddRunnable(), "OddThread");
		
		
		oddThread.start();
		evenThread.start();
		
	}
	
	static class EvenRunnable implements Runnable{

		@Override
		public void run() {
			while(nextNum <= MAX_NUM){
				synchronized(lock) {
					if(nextNum % 2 == 0) {
						System.out.println(Thread.currentThread().getName() + ": " + nextNum);
						nextNum++;		
						lock.notify();
					}else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}
		}
		
	}	
}
	static class OddRunnable implements Runnable{

		@Override
		public void run() {
			while(nextNum <= MAX_NUM) {
				synchronized(lock) {
					if(nextNum % 2 == 1){
						System.out.println(Thread.currentThread().getName() + ": " + nextNum);
						nextNum++;						
						lock.notify();
					}else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
}
