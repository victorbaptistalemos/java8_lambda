package vbl.java.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.List;

public class Capitulo4b {

  public static void main(String[]args) {

    Usuario usuario1 = new Usuario("Paulo Silveira", 150);
    Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
    Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(usuario1);
    usuarios.add(usuario2);
    usuarios.add(usuario3);

    Predicate<Usuario> predicado = new Predicate<>() {

      public boolean test(Usuario u) {

        return u.getPontos() > 160;

      }

    };

    usuarios.removeIf(predicado);
    usuarios.forEach(u -> System.out.println(u.getNome()));

  }

}
