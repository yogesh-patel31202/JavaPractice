
public class ThreadYieldMethod extends Thread{

	public void run() {
		// TODO Auto-generated method stub
		Thread.yield();
		for (int i = 1; i <= 5; i++) {
	
			System.out.println(Thread.currentThread().getName() + " - " + i);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadYieldMethod th = new ThreadYieldMethod();
		th.start();

		// Thread.yield();//if you want main method to stop and provide chance other thread for execution. if window support
		// support
		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " - " + i);

		}

	}

}
