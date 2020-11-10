package vbl.java.lambda;

public class Capitulo3b {

  public static void main(String[]args) {

    new Thread( () -> { for (int i = 0; i <= 1000; i++) {System.out.println(1);} } ).start();

  }

}
