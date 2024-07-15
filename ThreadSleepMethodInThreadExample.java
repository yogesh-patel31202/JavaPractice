
public class ThreadSleepMethodInThreadExample extends Thread{

	public void run() {
		  
		  for (int i = 1; i <= 5; i++) {
		  
		  try {
		  
		  Thread.sleep(1000); //Thread.sleep(-1); //Thread.sleep(1000,-1);
		  
		  } catch (InterruptedException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
		  
		  System.out.println(i); }
		  
		  }
		  
		  public static void main(String[] args) { // TODO Auto-generated method stub
		  
			  ThreadSleepMethodInThreadExample th = new ThreadSleepMethodInThreadExample(); 
			  th.start();
		  
		  }

}
