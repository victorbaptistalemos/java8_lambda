package vbl.java.lambda;

import java.time.*;

public class Capitulo10a {

    public static void main(String[] args) {

        LocalDate anoPassado = LocalDate.now().minusYears(1);
        System.out.println(anoPassado);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime meioDia = LocalDate.now().atTime(12,12, 12);
        System.out.println(meioDia);

        LocalDateTime dataEHora = anoPassado.plusYears(1).atTime(agora);
        System.out.println(dataEHora);

        ZonedDateTime zonedDateTime = dataEHora.atZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println(zonedDateTime);

        LocalDate dataDoPassado = LocalDate.now().withYear(1989);
        System.out.println(dataDoPassado.getYear());

    }

}
