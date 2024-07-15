
public class SynchronizationWaitNotifyAndNotifyAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TotalEarning te = new TotalEarning();
		te.start();

		// System.out.println("Total earining: " + te.total + " RS ");

		synchronized (te) {

			try {
				te.wait();
				System.out.println("Total earining: " + te.total + " RS ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class TotalEarning extends Thread

{
	int total = 0;

	public void run() {

		synchronized (this) {
			
			for (int i = 0; i < 10; i++) {

				total = total + 100;

			}
			
			this.notify();

		}

	}

}
