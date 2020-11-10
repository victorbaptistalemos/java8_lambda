package vbl.java.lambda;

import java.io.IOException;

import static java.nio.file.Files.lines;
import static java.nio.file.Files.list;
import static java.nio.file.Paths.get;

public class Capitulo8az {

  public static void main(String[]args) throws IOException{

    list(get("/home/victorbaptistalemos/IdeaProjects/Lambda/src/vbl/java/lambda"))
         .filter(p -> p.toString().contains("Capitulo8"))
         .map(p -> {
           try {return lines(p);}
           catch (IOException e) {return e.getStackTrace();}
         })
         .forEach(System.out::println);

  }

}
