package vbl.java.lambda;

import java.io.IOException;
import java.util.List;

import static java.nio.file.Files.lines;
import static java.nio.file.Files.list;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.toList;

public class Capitulo9b {

  public static void main(String[]args) throws IOException {

      List<Long> longList =
              list(get("/home/victorbaptistalemos/IdeaProjects/Lambda/src/vbl/java/lambda"))
                   .filter(p -> p.toString().contains("Capitulo9"))
                   .map(p -> {
                       try {return lines(p).count();}
                       catch (IOException e) {return null;}
                   })
                   .collect(toList());

      longList.forEach(System.out::println);

  }

}
