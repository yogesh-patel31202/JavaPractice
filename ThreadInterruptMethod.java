
public class ThreadInterruptMethod extends Thread{

	public void run() {

		try {

			for (int i = 1; i <= 5; i++) {

				System.out.println(i);

				Thread.sleep(1000);

			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("therad Interrupted" +e);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadInterruptMethod th = new ThreadInterruptMethod();
		th.start();
		th.interrupt();

	}

}
