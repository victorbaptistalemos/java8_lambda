package vbl.java.lambda;

public class Capitulo3d {

  public static void main(String[]args) {

    String valor = "29175-608";

    Validador<String> validadorCEP = s -> s.matches("[0-9]{5}-[0-9]{3}");

    System.out.println(validadorCEP.valida(valor));

  }

}
