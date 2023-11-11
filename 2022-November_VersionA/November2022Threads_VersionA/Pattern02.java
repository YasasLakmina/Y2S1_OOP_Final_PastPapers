package November2022Threads_VersionA;

public class Pattern02 extends Thread{
	private Object lock;
	private String pattern;
	private int count;
	
	public Pattern02(Object lock, String pattern, int count) {
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}

	public void run() {
		
		synchronized(lock) {
			
			for(int i = 0 ; i < count ; i++) {
				System.out.print("Pattern 02 Thread =  ");
				
				for(int j = 0 ; j < count-i ; j++) {
					System.out.print(" ");
				}
				
				for(int x = 0 ; x < i+1 ; x++) {
					System.out.print(pattern + " ");
				}
				
				System.out.println();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				lock.notify();
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
