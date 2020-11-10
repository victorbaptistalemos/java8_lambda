package vbl.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Capitulo8am {

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

    long totalMultiplicacao =
            usuarios.stream()
                    .mapToLong(Usuario::getPontos)
                    .reduce(1, (a, b) -> a * (b / 10));

    double totalDivisao =
            usuarios.stream()
                    .mapToDouble(Usuario::getPontos)
                    .reduce(totalMultiplicacao, (a, b) -> a / (b / 10));

    System.out.println(totalMultiplicacao);
    System.out.println(totalDivisao);

  }

}
