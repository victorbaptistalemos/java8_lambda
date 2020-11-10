package vbl.java.lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class Capitulo4a {

  public static void main(String[]args) {

    Usuario usuario1 = new Usuario("Paulo Silveira", 150);
    Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
    Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

    List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

    Consumer<Usuario> mostraMensagem = c -> System.out.println("Antes de imprimir os nomes:");
    Consumer<Usuario> imprimeNome = c -> System.out.println(c.getNome());

    usuarios.forEach(mostraMensagem.andThen(imprimeNome));

  }

}
