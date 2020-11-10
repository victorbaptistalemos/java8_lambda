package vbl.java.lambda;

import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.YearMonth;

public class Capitulo10d {

    public static void main(String[] args) {

        System.out.println("Hoje é dia: " + MonthDay.now().getDayOfMonth());

        LocalDateTime localDateTime = LocalDateTime.now();

        YearMonth yearMonth = YearMonth.from(localDateTime);

        System.out.println(yearMonth.getMonth() + " " + yearMonth.getYear());

    }

}
