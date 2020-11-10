package vbl.java.lambda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Capitulo10j {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        LocalDate outraData = LocalDate.of(2020, Month.MAY, 9);

        Period periodo = Period.between(outraData, agora);

        System.out.printf("%s anos, %s meses e %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());

    }

}
