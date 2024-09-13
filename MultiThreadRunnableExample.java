// Runnable implementation for task 1
class RunnableTask1 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("RunnableTask1 - Count: " + i);
      try {
        // Simulate work with sleep
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("RunnableTask1 interrupted: " + e);
      }
    }
  }
}

// Runnable implementation for task 2
class RunnableTask2 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("RunnableTask2 - Count: " + i);
      try {
        // Simulate work with sleep
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("RunnableTask2 interrupted: " + e);
      }
    }
  }
}

// Main class
public class MultiThreadRunnableExample {
  public static void main(String[] args) {
    // Create Runnable instances
    Runnable runnable1 = new RunnableTask1();
    Runnable runnable2 = new RunnableTask2();

    // Create Thread instances with Runnable targets
    Thread thread1 = new Thread(runnable1);
    Thread thread2 = new Thread(runnable2);

    // Start the threads
    thread1.start();
    thread2.start();
  }
}
