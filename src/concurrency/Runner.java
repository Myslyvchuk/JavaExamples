package concurrency;

public class Runner {
  
  public static volatile boolean shutdown = false;

  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(Runner::run);
    thread.start();

    thread.interrupt();
    thread.join(100);
  }

  public static void run() {
    System.out.println("Run - started");
    while (!Thread.currentThread().isInterrupted() || shutdown) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    System.out.println("Run - finished");
  }
}