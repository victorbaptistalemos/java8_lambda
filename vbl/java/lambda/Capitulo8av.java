package vbl.java.lambda;

import java.util.stream.IntStream;

public class Capitulo8av {

  public static void main(String[]args) {

    int maiorQue100 =
            IntStream.generate(new Fibonacci())
                     .filter(f -> f > 100)
                     .findFirst()
                     .getAsInt();

    System.out.println(maiorQue100);

  }

}
