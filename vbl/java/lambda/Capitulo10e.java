package vbl.java.lambda;

import java.time.LocalDate;
import java.time.Month;

public class Capitulo10e {

    public static void main(String[] args) {

        System.out.println(LocalDate.of(2020, 5, 9));
        System.out.println(LocalDate.of(2020, Month.MAY, 9));

        System.out.println(Month.MAY.firstMonthOfQuarter());
        System.out.println(Month.MAY.plus(4));
        System.out.println(Month.MAY.minus(2));

    }

}
