package vbl.java.lambda;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import static java.nio.file.Files.lines;
import static java.nio.file.Files.list;
import static java.nio.file.Paths.get;

public class Capitulo9c {

  public static void main(String[]args) throws IOException {

      Map<Path, Long> linhasPorArquivo = new HashMap<>();

      list(get("/home/victorbaptistalemos/IdeaProjects/Lambda/src/vbl/java/lambda"))
           .filter(p -> p.toString().contains("Capitulo9"))
           .forEach(p -> {
                  try {linhasPorArquivo.put(p, lines(p).count());}
                  catch (IOException e) {e.printStackTrace();}
              });

      System.out.println(linhasPorArquivo);








  }

}
