package Preparation8;

public class WaitMethod extends Thread {
	public void run() {
		synchronized(this) {
			this.notify();
			
		}
		System.out.println("dhananjeyan");
	}
	public static void main(String[] args) throws InterruptedException  {
		WaitMethod wm=new WaitMethod();
		wm.start();
		synchronized(wm) {
			System.out.println("Hello");
			wm.wait();
			System.out.println("world");
		}
		
		
	}

}
