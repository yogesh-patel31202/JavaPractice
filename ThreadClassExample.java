// Thread subclass
class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getId() + " Value: " + i);
      try {
        // Sleep for a short time
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}

// Main class
public class ThreadClassExample {
  public static void main(String[] args) {
    // Create and start two threads
    MyThread thread1 = new MyThread();
    MyThread thread2 = new MyThread();

    thread1.start();
    thread2.start();
  }
}
