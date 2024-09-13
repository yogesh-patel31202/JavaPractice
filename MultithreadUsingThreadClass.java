
// Thread subclass for task 1
class Task1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Task1 - Count: " + i);
      try {
        // Simulate work with sleep
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Task1 interrupted: " + e);
      }
    }
  }
}

// Thread subclass for task 2
class Task2 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Task2 - Count: " + i);
      try {
        // Simulate work with sleep
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("Task2 interrupted: " + e);
      }
    }
  }
}

// Main class
public class MultithreadUsingThreadClass {
  public static void main(String[] args) {
    // Create and start threads
    Task1 thread1 = new Task1();
    Task2 thread2 = new Task2();

    thread1.start();
    thread2.start();
  }
}
