package vbl.java.lambda;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Capitulo10f {

    public static void main(String[] args) {

        Locale pt = new Locale("pt");

        System.out.println(Month.MAY.getDisplayName(TextStyle.FULL, pt));
        System.out.println(Month.MAY.getDisplayName(TextStyle.SHORT, pt));

    }

}
