package vbl.java.lambda;

import static java.util.stream.LongStream.range;

public class Capitulo9o {

  public static void main(String[]args) {

      long soma = range(0, 1_000_000_000)
              .parallel()
              .filter(x -> x % 2 == 0)
              .sum();

      System.out.println(soma);

  }

}
