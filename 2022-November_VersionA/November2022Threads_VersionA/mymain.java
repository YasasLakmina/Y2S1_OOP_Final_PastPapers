package November2022Threads_VersionA;

import java.util.Scanner;

public class mymain {
	public static void main(String[] args) {
		String pattern1;
		String pattern2;
		int count;
		
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter pattern 1 = ");
		pattern1 = ob.nextLine();
		
		System.out.print("Enter pattern 2 = ");
		pattern2 = ob.nextLine();
		
		System.out.print("Enter Count = ");
		count = ob.nextInt();
		
		Object lock = new Object();
	
		Pattern01 t1 = new Pattern01(lock, pattern1,count);
		Pattern02 t2 = new Pattern02(lock,pattern2,count);
		
		
		t2.start();
		t1.start();	
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
