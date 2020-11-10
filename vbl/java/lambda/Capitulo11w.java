package vbl.java.lambda;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

public class Capitulo11w {

    public static void main(String[] args) {

        Cliente paulo = new Cliente("Paulo Silveira");
        Cliente rodrigo = new Cliente("Rodrigo Turini");
        Cliente adriano = new Cliente("Adriano Almeida");

        LocalDateTime hoje = LocalDateTime.now();
        LocalDateTime ontem = LocalDateTime.now().minusDays(1);

        BigDecimal valorMensal = new BigDecimal(String.valueOf(99.90));

        Assinatura assinatura1 = new Assinatura(valorMensal, ontem.minusMonths(5), paulo);
        Assinatura assinatura2 = new Assinatura(valorMensal, hoje.minusMonths(1), rodrigo);
        Assinatura assinatura3 = new Assinatura(valorMensal, hoje.minusMonths(2), adriano);

        List<Assinatura> assinaturas = asList(assinatura1, assinatura2, assinatura3);

        BigDecimal totalPago =
                assinaturas.stream()
                           .map(Assinatura::getTotalPago)
                           .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalPago);

    }

}
