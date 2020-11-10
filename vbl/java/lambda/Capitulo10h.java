package vbl.java.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Capitulo10h {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String resultado = agora.format(formatador);

        LocalDate agoraEmData = LocalDate.parse(resultado, formatador);

        System.out.println(resultado);
        System.out.println(agoraEmData);

    }

}
