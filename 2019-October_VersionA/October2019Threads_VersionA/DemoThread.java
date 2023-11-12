package October2019Threads_VersionA;

public class DemoThread {

	public static void main(String[] args) {
		
		DemoThread demoThread = new DemoThread();
		
		Thread addNumbers = new Thread(new AddNumbers(demoThread,10,20) , "ADD");
		Thread multiplyNumbers = new Thread(new MultiplyNumbers(demoThread,10,20) , "MUL");
		
		multiplyNumbers.start();
		addNumbers.start();
				
	}
}	
	class AddNumbers implements Runnable{
		
		private Object demoThread;
		private int begin;
		private int end;

		public AddNumbers(Object demoThread, int begin, int end) {
			this.demoThread = demoThread;
			this.begin = begin;
			this.end = end;
		}
		
		public void addNumbers(Object demoThread, int begin, int end) {
			synchronized(demoThread) {
				
			
				while(begin <= end) {
					System.out.println(Thread.currentThread().getName() + " = > " + begin + " (+) " + begin + " = " + (begin+begin));
					begin++;
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					demoThread.notify();
					
					try {
						demoThread.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}		
				}
			}
		}

		@Override
		public void run() {			
				addNumbers(demoThread,begin,end);	
		}
		
	}
	
	class MultiplyNumbers implements Runnable{

		private Object demoThread;
		private int begin;
		private int end;
		
		public MultiplyNumbers(Object demoThread, int begin, int end) {
			this.demoThread = demoThread;
			this.begin = begin;
			this.end = end;
		}
		
		public void multiplyNumbers(Object demoThread, int begin, int end) {
			
			synchronized(demoThread) {
				
				
				while(begin <= end){
				System.out.println(Thread.currentThread().getName() + " = > " + begin + " (*) " + begin + " = " + (begin*begin));
				begin++;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				demoThread.notify();
				
				try {
					demoThread.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
		}
	}		
		
		@Override
		public void run() {
			multiplyNumbers(demoThread,begin,end);
		}	
	}

