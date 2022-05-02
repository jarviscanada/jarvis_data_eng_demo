package ca.jrvs.practice.multithreading;

public class PrintThread implements Runnable {

  public static void main(String[] args) {
    PrintThread t1 = new PrintThread();
    Thread thread;
    for (int i = 0; i < 9; i++) {
      thread = new Thread(new PrintThread());
      thread.start();
    }
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getId());
  }
}
