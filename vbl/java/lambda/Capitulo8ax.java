package vbl.java.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Capitulo8ax {

  public static void main(String[]args) throws IOException {

    Files.list(Paths.get("/home/victorbaptistalemos/IdeaProjects/Lambda/src/vbl/java/lambda"))
         .forEach(System.out::println);

  }

}
