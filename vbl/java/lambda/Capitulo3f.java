package vbl.java.lambda;

public class Capitulo3f {

  public static void main(String[]args) {

    int numero = 5;
    new Thread(() -> {System.out.println(numero);}).start();

  }

}
