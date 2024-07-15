
public class ThreadInterruptedAndIsInterruptedMethods extends Thread{

public void run() {
		
		System.out.println("A : "+ Thread.interrupted());// true to false status
		System.out.println(Thread.currentThread().isInterrupted());//true
		System.out.println(Thread.currentThread().isInterrupted());//true

		try {

			for (int i = 1; i <= 5; i++) {

				System.out.println(i);

				Thread.sleep(1000);
				//System.out.println("B : "+ Thread.interrupted());

			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("therad Interrupted" + e);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadInterruptedAndIsInterruptedMethods th = new ThreadInterruptedAndIsInterruptedMethods();
		th.start();
		th.interrupt();

	}

}
