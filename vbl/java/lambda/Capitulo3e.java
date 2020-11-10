package vbl.java.lambda;

public class Capitulo3e {

  public static void main(String[]args) {

    Runnable o = () -> System.out.println("O que sou eu? Que lambda?");

    System.out.println(o);
    System.out.println(o.getClass());

  }

}
