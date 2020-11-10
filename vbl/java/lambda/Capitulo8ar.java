package vbl.java.lambda;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Capitulo8ar {

  public static void main(String[]args) {

    Random random = new Random(0);

    IntSupplier intSupplier = () -> random.nextInt();

    IntStream integerStream = IntStream.generate(intSupplier);

  }

}
