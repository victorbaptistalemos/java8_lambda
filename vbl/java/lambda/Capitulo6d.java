package vbl.java.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Capitulo6d {

  public static void main(String[]args) {

    Usuario usuario1 = new Usuario("Paulo Silveira", 150);
    Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
    Usuario usuario3 = new Usuario("Guilherme Silveira", 190);
    Usuario usuario4 = new Usuario("Fulano da Silva", 150);
    Usuario usuario5 = new Usuario("Cicrano dos Santos", 200);
    Usuario usuario6 = new Usuario("Beltrano de Souza", 190);

    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(usuario1);
    usuarios.add(usuario2);
    usuarios.add(usuario3);
    usuarios.add(usuario4);
    usuarios.add(usuario5);
    usuarios.add(usuario6);

    usuarios.sort(Comparator.comparingInt(Usuario::getPontos).thenComparing(Usuario::getNome));
    usuarios.forEach(u -> System.out.println(u.getNome()));

  }

}
