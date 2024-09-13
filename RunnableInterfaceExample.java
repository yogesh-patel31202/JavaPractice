// Runnable implementation
class MyRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getId() + " Value: " + i);
      try {
        // Sleep for a short time
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}

// Main class
public class RunnableInterfaceExample {
  public static void main(String[] args) {
    // Create Runnable instances
    Runnable myRunnable1 = new MyRunnable();
    Runnable myRunnable2 = new MyRunnable();

    // Create Thread instances with Runnable targets
    Thread thread1 = new Thread(myRunnable1);
    Thread thread2 = new Thread(myRunnable2);

    // Start the threads
    thread1.start();
    thread2.start();
  }
}
