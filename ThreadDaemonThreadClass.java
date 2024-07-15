
public class ThreadDaemonThreadClass extends Thread {

	public void run() {
		
		System.out.println("daeman therad");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("main thread"); 
		// main thread no work so not run daemon thread
		//note: main thread is not daemon thread
		//Thread.currentThread().setDaemon(true);//not possible

		ThreadDaemonThreadClass th = new ThreadDaemonThreadClass();

		th.setDaemon(true);
		th.start();

		//th.setDaemon(true);// not working
	}

}
