package vbl.java.lambda;

import java.util.stream.IntStream;

public class Capitulo8au {

  public static void main(String[]args) {

    IntStream.generate(new Fibonacci()).limit(10).forEach(System.out::println);

  }

}
