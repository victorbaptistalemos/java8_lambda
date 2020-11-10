package vbl.java.lambda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Capitulo10g {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        String resultado = agora.format(DateTimeFormatter.ISO_LOCAL_TIME);

        System.out.println(resultado);

    }

}
