package vbl.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class Capitulo7a {

  public static void main(String[]args) {

    List<Usuario> usuarios = new ArrayList<>();
    BiFunction<String, Integer, Usuario> criadorDeUsuarios = Usuario::new;

    usuarios.add(criadorDeUsuarios.apply("Paulo Silveira", 150));
    usuarios.add(criadorDeUsuarios.apply("Rodrigo Turini", 120));
    usuarios.add(criadorDeUsuarios.apply("Guilherme Silveira", 190));
    usuarios.add(criadorDeUsuarios.apply("Fulano Silva", 150));
    usuarios.add(criadorDeUsuarios.apply("Fulano Santos", 140));
    usuarios.add(criadorDeUsuarios.apply("Fulano Souza", 150));
    usuarios.add(criadorDeUsuarios.apply("Cicrano Ferreira", 200));
    usuarios.add(criadorDeUsuarios.apply("Cicrano Vieira", 190));
    usuarios.add(criadorDeUsuarios.apply("Cicrano Mendes", 200));
    usuarios.add(criadorDeUsuarios.apply("Beltrano Almeida", 190));
    usuarios.add(criadorDeUsuarios.apply("Beltrano Pereira", 120));
    usuarios.add(criadorDeUsuarios.apply("Beltrano Carvalho", 110));

    usuarios.sort(comparing(Usuario::getNome));
    usuarios.sort(comparingInt(Usuario::getPontos).reversed());

    usuarios.subList(0,10).forEach(Usuario::tornaModerador);

    usuarios.forEach(System.out::println);

  }

}
