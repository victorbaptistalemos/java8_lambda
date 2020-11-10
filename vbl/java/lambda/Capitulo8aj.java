package vbl.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Capitulo8aj {

  public static void main(String[]args) {

    List<Usuario> usuarios = new ArrayList<>();

    usuarios.add(new Usuario("Paulo Silveira", 150));
    usuarios.add(new Usuario("Rodrigo Turini", 120));
    usuarios.add(new Usuario("Guilherme Silveira", 190));
    usuarios.add(new Usuario("Fulano Silva", 210));
    usuarios.add(new Usuario("Fulano Santos", 140));
    usuarios.add(new Usuario("Fulano Souza", 150));
    usuarios.add(new Usuario("Cicrano Ferreira", 200));
    usuarios.add(new Usuario("Cicrano Vieira", 190));
    usuarios.add(new Usuario("Cicrano Mendes", 200));
    usuarios.add(new Usuario("Beltrano Almeida", 190));
    usuarios.add(new Usuario("Beltrano Pereira", 120));
    usuarios.add(new Usuario("Beltrano Carvalho", 110));

    usuarios.forEach(u -> {if (u.getPontos() >= 175) u.tornaModerador();});

    int valorInicial = 0;

    int total =
            usuarios.stream()
                    .mapToInt(Usuario::getPontos)
                    .reduce(0, Integer::sum);

    System.out.println(total);

  }

}
