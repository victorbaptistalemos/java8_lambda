package vbl.java.lambda;

import java.util.ArrayList;
import static java.util.Comparator.comparingInt;
import java.util.List;

public class Capitulo5m {

  public static void main(String[]args) {

    Usuario usuario1 = new Usuario("Paulo Silveira", 150);
    Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
    Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(usuario1);
    usuarios.add(usuario2);
    usuarios.add(usuario3);

    usuarios.sort(comparingInt(u -> u.getPontos()));
    usuarios.forEach(u -> System.out.println(u.getNome()));

  }

}
