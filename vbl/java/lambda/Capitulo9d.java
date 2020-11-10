package vbl.java.lambda;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

import static java.nio.file.Files.lines;
import static java.nio.file.Files.list;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.toMap;

public class Capitulo9d {

  public static void main(String[]args) throws IOException {

      Map<Path, Long> linhasPorArquivo =
              list(get("/home/victorbaptistalemos/IdeaProjects/Lambda/src/vbl/java/lambda"))
                      .filter(p -> p.toString().contains("Capitulo9"))
                      .collect(toMap(p -> p, p -> {
                          try {return lines(p).count();}
                          catch (IOException e) {return null;}
                      }));

      System.out.println(linhasPorArquivo);

  }

}
