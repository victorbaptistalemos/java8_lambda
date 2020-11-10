package vbl.java.lambda;

import java.util.Arrays;
import static java.util.Comparator;
import java.util.List;

public class Capitulo5h {

  public static void main(String[]args) {

    List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");

    palavras.sort(Comparator.naturalOrder());

  }

}
