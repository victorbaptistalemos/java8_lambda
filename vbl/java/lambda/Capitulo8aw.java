package vbl.java.lambda;

import java.util.stream.IntStream;

public class Capitulo8aw {

  public static void main(String[]args) {

    IntStream.iterate(0, x -> x + 1)
             .limit(10)
             .forEach(System.out::println);

  }

}
