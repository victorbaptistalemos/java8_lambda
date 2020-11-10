package vbl.java.lambda;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Capitulo8aq {

  public static void main(String[]args) {

    Random random = new Random(0);

    Supplier<Integer> integerSupplier = () -> random.nextInt();

    Stream<Integer> integerStream = Stream.generate(integerSupplier);

  }

}
