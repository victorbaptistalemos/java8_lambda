package vbl.java.lambda;

import java.time.*;

public class Capitulo10b {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate amanha = LocalDate.now().plusDays(1);
        LocalDate ontem = LocalDate.now().minusDays(1);
        System.out.println(hoje.isAfter(ontem));
        System.out.println(hoje.isAfter(amanha));
        System.out.println(hoje.isBefore(ontem));
        System.out.println(hoje.isBefore(amanha));
        System.out.println(hoje.isEqual(ontem));
        System.out.println(hoje.isEqual(amanha));

    }

}
