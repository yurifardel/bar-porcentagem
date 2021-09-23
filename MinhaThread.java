public class MinhaThread extends Thread {
  public MinhaThread() {
    start();
  }

  public void run() {

    try {
      String animação = "|/-\\";
      for (int x = 0 ; x <= 100 ; x++) {
          String data = "\r" + animação.charAt(x % animação.length()) + " " + x + "%";
          System.out.print(data);
          Thread.sleep(100);
      }

    } catch (InterruptedException  e) {
      e.printStackTrace();
    }

  }
}

class teste {
  public static void main(String[] args) {
    new MinhaThread();
  }
}