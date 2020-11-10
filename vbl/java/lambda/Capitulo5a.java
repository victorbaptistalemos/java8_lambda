package vbl.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Capitulo5a {

  public static void main(String[]args) {

    Usuario usuario1 = new Usuario("Paulo Silveira", 150);
    Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
    Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(usuario1);
    usuarios.add(usuario2);
    usuarios.add(usuario3);

    Comparator<Usuario> comparador = new Comparator<>() {

      public int compare(Usuario u1, Usuario u2) {

        return u1.getNome().compareTo(u2.getNome());

      }

    };

    Collections.sort(usuarios, comparador);

    usuarios.forEach(u -> System.out.println(u.getNome()));

  }

}
