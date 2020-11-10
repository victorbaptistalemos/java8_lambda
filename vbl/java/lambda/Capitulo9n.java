package vbl.java.lambda;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Capitulo9n {

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

      List<Usuario> usuarios = new ArrayList<>();
      usuarios.add(usuario01);
      usuarios.add(usuario02);
      usuarios.add(usuario03);
      usuarios.add(usuario04);
      usuarios.add(usuario05);
      usuarios.add(usuario06);
      usuarios.add(usuario07);
      usuarios.add(usuario08);
      usuarios.add(usuario09);
      usuarios.add(usuario10);
      usuarios.add(usuario11);
      usuarios.add(usuario12);
      usuarios.add(usuario13);
      usuarios.add(usuario14);

      List<Usuario> filtradosOrdenados =
              usuarios.parallelStream()
                      .filter(u -> u.getPontos() > 175)
                      .sorted(comparing(Usuario::getNome))
                      .collect(toList());

      System.out.println(filtradosOrdenados);

  }

}
