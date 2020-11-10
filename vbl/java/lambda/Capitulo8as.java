package vbl.java.lambda;

import java.util.Random;
import java.util.stream.IntStream;

public class Capitulo8as {

  public static void main(String[]args) {

    Random random = new Random(0);

    IntStream integerStream = IntStream.generate(() -> random.nextInt());

  }

}
