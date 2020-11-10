package vbl.java.lambda;

public class Usuario {

  private String nome;
  private Integer pontos;
  private Boolean moderador;

  public Usuario(String nome, Integer pontos) {

    this.nome = nome;
    this.pontos = pontos;
    this.moderador = false;

  }

  public Usuario(String nome, Integer pontos, boolean moderador) {

    this.nome = nome;
    this.pontos = pontos;
    this.moderador = moderador;

  }

  public String getNome() {return nome;}

  public Integer getPontos() {return pontos;}

  public Boolean isModerador() {return moderador;}

  public void tornaModerador() {this.moderador = true;}

  @Override
  public String toString() {
    return getNome() + ", " + getPontos() + ", moderador: " + (isModerador() ? "sim" : "não");
  }

}
