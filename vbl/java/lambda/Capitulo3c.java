package vbl.java.lambda;

public class Capitulo3c {

  public static void main(String[]args) {

    String valor = "29175-608";

    Validador<String> validadorCEP = new Validador<>() {

      public boolean valida(String valor) {

        return valor.matches("[0-9]{5}-[0-9]{3}");

      }

    };

    System.out.println(validadorCEP.valida(valor));

  }

}
