package vbl.java.lambda;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

import static java.util.stream.Collectors.toList;

public class Capitulo7g {

  public static void main(String[]args) {

    List<Usuario> usuarios = new ArrayList<>();

    usuarios.add(new Usuario("Paulo Silveira", 150));
    usuarios.add(new Usuario("Rodrigo Turini", 120));
    usuarios.add(new Usuario("Guilherme Silveira", 190));
    usuarios.add(new Usuario("Fulano Silva", 150));
    usuarios.add(new Usuario("Fulano Santos", 140));
    usuarios.add(new Usuario("Fulano Souza", 150));
    usuarios.add(new Usuario("Cicrano Ferreira", 200));
    usuarios.add(new Usuario("Cicrano Vieira", 190));
    usuarios.add(new Usuario("Cicrano Mendes", 200));
    usuarios.add(new Usuario("Beltrano Almeida", 190));
    usuarios.add(new Usuario("Beltrano Pereira", 120));
    usuarios.add(new Usuario("Beltrano Carvalho", 110));

    usuarios.sort(comparing(Usuario::getNome));
    usuarios.sort(comparingInt(Usuario::getPontos).reversed());

    System.out.println("Primeiro imprime a lista completa sem alterações");
    usuarios.forEach(System.out::println);

    List<Usuario> moderadores = new ArrayList<>();
    System.out.println("\nDepois imprime a nova lista (filtrada)");

    usuarios.stream().filter(u -> u.getPontos() >= 175).collect(toList());
    moderadores.forEach(Usuario::tornaModerador);
    moderadores.forEach(System.out::println);

  }

}
