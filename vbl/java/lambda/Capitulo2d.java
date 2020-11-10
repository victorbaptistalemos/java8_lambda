package vbl.java.lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class Capitulo2d {

  public static void main(String[]args) {

    Usuario usuario1 = new Usuario("Paulo Silveira", 150);
    Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
    Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

    List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

    Consumer<Usuario> mostrador = (Usuario u) -> System.out.println(u.getNome());

    usuarios.forEach(mostrador);

  }

}
