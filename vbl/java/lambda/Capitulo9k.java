package vbl.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.summingInt;

public class Capitulo9k {

  public static void main(String[]args) {

      Usuario usuario01 = new Usuario("Paulo Silveira", 150, true);
      Usuario usuario02 = new Usuario("Rodrigo Turini", 120, true);
      Usuario usuario03 = new Usuario("Guilherme Silveira", 190);
      Usuario usuario04 = new Usuario("Sergio Lopes", 90);
      Usuario usuario05 = new Usuario("Adriano Almeida", 130);
      Usuario usuario06 = new Usuario("Fulano Silva", 210, true);
      Usuario usuario07 = new Usuario("Fulano Santos", 140);
      Usuario usuario08 = new Usuario("Fulano Souza", 150);
      Usuario usuario09 = new Usuario("Cicrano Ferreira", 200, true);
      Usuario usuario10 = new Usuario("Cicrano Vieira", 190);
      Usuario usuario11 = new Usuario("Cicrano Mendes", 200, true);
      Usuario usuario12 = new Usuario("Beltrano Almeida", 190);
      Usuario usuario13 = new Usuario("Beltrano Pereira", 120);
      Usuario usuario14 = new Usuario("Beltrano Carvalho", 110);

      List<Usuario> usuarios = Arrays.asList(
              usuario01,
              usuario02,
              usuario03,
              usuario04,
              usuario05,
              usuario06,
              usuario07,
              usuario08,
              usuario09,
              usuario10,
              usuario11,
              usuario12,
              usuario13,
              usuario14);

      Map<Boolean, Integer> booleanIntegerMap =
              usuarios.stream()
                      .collect(partitioningBy(Usuario::isModerador, summingInt(Usuario::getPontos)));

      System.out.println(booleanIntegerMap);

  }

}
