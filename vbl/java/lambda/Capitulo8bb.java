package vbl.java.lambda;

import java.io.IOException;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

import static java.nio.file.Files.lines;
import static java.nio.file.Files.list;
import static java.nio.file.Paths.get;

public class Capitulo8bb {

  public static void main(String[]args) throws IOException{

    IntStream chars =
            list(get("/home/victorbaptistalemos/IdeaProjects/Lambda/src/vbl/java/lambda"))
                 .filter(p -> p.toString().contains("Capitulo8"))
                 .sorted()
                 .flatMap(p -> {
                   try {return lines(p);}
                   catch (IOException e) {return null;}
                 })
                 .flatMapToInt(CharSequence::chars);

    chars.iterator().forEachRemaining((IntConsumer) u -> System.out.println(u));

  }

}
