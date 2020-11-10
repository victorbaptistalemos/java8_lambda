package vbl.java.lambda;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Capitulo10i {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        LocalDate outraData = LocalDate.of(2020, Month.MAY, 9);

        long dias = ChronoUnit.DAYS.between(outraData, agora);
        long meses = ChronoUnit.MONTHS.between(outraData, agora);
        long anos = ChronoUnit.YEARS.between(outraData, agora);

        System.out.printf("%s dias, %s meses e %s anos", dias, meses, anos);

    }

}
