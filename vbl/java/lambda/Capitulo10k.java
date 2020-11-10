package vbl.java.lambda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Capitulo10k {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        LocalDate outraData = LocalDate.of(2020, Month.MAY, 9);

        Period periodo = Period.between(agora, outraData);

        if (periodo.isNegative()) periodo = periodo.negated();

        System.out.printf("%s anos, %s meses e %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());

    }

}
