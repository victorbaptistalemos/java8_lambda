package vbl.java.lambda;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Capitulo8at {

  public static void main(String[]args) {

    Random random = new Random(0);

    IntStream integerStream = IntStream.generate(() -> random.nextInt());

    List<Integer> integerList =
            integerStream.limit(100)
                         .boxed()
                         .collect(toList());

  }

}
