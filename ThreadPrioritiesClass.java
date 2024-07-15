
public class ThreadPrioritiesClass extends Thread{

	public void run() {

		System.out.println("child thread");
		System.out.println("child thread Priority: "
				+ Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main thread old Priority: " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread new Priority: " + Thread.currentThread().getPriority());
		ThreadPrioritiesClass th = new ThreadPrioritiesClass();
		th.setPriority(3);
		th.start();

	}

}
