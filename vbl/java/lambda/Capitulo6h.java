package vbl.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class Capitulo6h {

  public static void main(String[]args) {

    List<Usuario> usuarios = new ArrayList<>();
    BiFunction<String, Integer, Usuario> criadorDeUsuarios = Usuario::new;

    usuarios.add(criadorDeUsuarios.apply("Paulo Silveira", 150));
    usuarios.add(criadorDeUsuarios.apply("Rodrigo Turini", 120));
    usuarios.add(criadorDeUsuarios.apply("Guilherme Silveira", 190));
    usuarios.add(criadorDeUsuarios.apply("Fulano da Silva", 150));
    usuarios.add(criadorDeUsuarios.apply("Cicrano dos Santos", 200));
    usuarios.add(criadorDeUsuarios.apply("Beltrano de Souza", 190));

    usuarios.sort(comparing(Usuario::getNome));
    usuarios.sort(comparingInt(Usuario::getPontos).reversed());
    usuarios.forEach(u -> System.out.println(u.getNome()));

  }

}
