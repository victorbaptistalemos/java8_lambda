package vbl.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Capitulo8bd {

  public static void main(String[]args) {

    Usuario usuario1 = new Usuario("Paulo Silveira", 150);
    Usuario usuario2 = new Usuario("Rodrigo Turini", 120);
    Usuario usuario3 = new Usuario("Guilherme Silveira", 190);

    Grupo englishSpeakers = new Grupo();
    englishSpeakers.add(usuario1);
    englishSpeakers.add(usuario2);

    Grupo spanishSpeakers = new Grupo();
    spanishSpeakers.add(usuario2);
    spanishSpeakers.add(usuario3);

    Grupo frenchSpeakers = new Grupo();
    frenchSpeakers.add(usuario1);
    frenchSpeakers.add(usuario3);

    List<Grupo> grupoList = Arrays.asList(englishSpeakers, spanishSpeakers, frenchSpeakers);

    grupoList.stream().flatMap(g -> g.getUsuarios().stream()).distinct().forEach(System.out::println);

  }

}
