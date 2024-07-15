
public class ThreadCreateByRunnableInterface implements Runnable {

		// 1) implements the interface first

		// 2) @Override the run method

		@Override
		public void run() {
			// TODO Auto-generated method stub

			System.out.println("thread is create by Runnable interface.");

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3) create the object of current class
		ThreadCreateByRunnableInterface t = new ThreadCreateByRunnableInterface();
				
		// 4) create the object of thread class , pass the parameter in the
		// constructor
				Thread th = new Thread(t);// by use t
				
		// 4) invoke the thread
		th.start();

	}

}
