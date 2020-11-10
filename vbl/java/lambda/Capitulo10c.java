package vbl.java.lambda;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Capitulo10c {

    public static void main(String[] args) {

        ZonedDateTime tokyo = ZonedDateTime.of(2020, 10, 27, 13, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime saoPaulo = ZonedDateTime.of(2020, 10, 27, 13, 0, 0, 0, ZoneId.of("America/Sao_Paulo"));
        saoPaulo = saoPaulo.minusHours(12);
        System.out.println(tokyo.isEqual(saoPaulo));

    }

}
