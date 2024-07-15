
public class ThreadCreateByThreadClass extends Thread{

		// 1) extend the class first

		// 2) @Override the run method

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("thread is create by Thread class.");
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		// 3) create the object of current class
		ThreadCreateByThreadClass th = new ThreadCreateByThreadClass();

		// 4) invoke the thread
		th.start();
		// th.start(); 	//show exception kyu thread dead hone ke bad fir se start nhi hota 
						// note:- start thread by run method


	}

}
