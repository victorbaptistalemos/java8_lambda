package vbl.java.lambda;

public class Capitulo3a {

  public static void main(String[]args) {

    Runnable r = new Runnable() {

      public void run() {

        for (int i = 0; i <= 1000; i++) {

          System.out.println(1);

        }

      }

    };

    new Thread(r).start();

  }

}
