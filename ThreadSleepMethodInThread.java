
public class ThreadSleepMethodInThread extends Thread{
	public void run() {

		for (int i = 1; i <= 5; i++) {

			try {

				System.out.println(i + " : " + Thread.currentThread().getName());
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadSleepMethodInThread th = new ThreadSleepMethodInThread();
		th.start();

		ThreadSleepMethodInThread th1 = new ThreadSleepMethodInThread();
		th1.start();

		/*
		  SleepMethodInThread th = new SleepMethodInThread(); 
		  th.start();
		  
		  SleepMethodInThread th1 = new SleepMethodInThread(); 
		  th1.run();
		 */

	}


}
