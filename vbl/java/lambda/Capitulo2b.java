package vbl.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Capitulo2b {

  public static void main(String[]args) {

    Usuario usuario1 = new Usuario("Paulo Silveira", 150);
    Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
    Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

    List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

    Mostrador mostrador = new Mostrador();
    usuarios.forEach(mostrador);

  }

}
