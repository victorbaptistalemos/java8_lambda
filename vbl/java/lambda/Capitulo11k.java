package vbl.java.lambda;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparing;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Capitulo11k {

    public static void main(String[] args) {

        Cliente paulo = new Cliente("Paulo Silveira");
        Cliente rodrigo = new Cliente("Rodrigo Turini");
        Cliente guilherme = new Cliente("Guilherme Silveira");
        Cliente adriano = new Cliente("Adriano Almeida");

        Produto bach = new Produto("Bach completo", Paths.get("/music/bach.mp3"), new BigDecimal(100));
        Produto poderosas = new Produto("Poderosas Anitta", Paths.get("/music/poderosas.mp3"), new BigDecimal(90));
        Produto bandeira = new Produto("Bandeira Brasil", Paths.get("/images/brasil.jpg"), new BigDecimal(50));
        Produto beauty = new Produto("Beleza Americana", Paths.get("/movies/beauty.mov"), new BigDecimal(150));
        Produto vingadores = new Produto("Os Vingadores", Paths.get("/movies/vingadores.mov"), new BigDecimal(200));
        Produto amelie = new Produto("Amelie Poulain", Paths.get("/movies/amelie.mov"), new BigDecimal(100));

        LocalDateTime hoje = LocalDateTime.now();
        LocalDateTime ontem = LocalDateTime.now().minusDays(1);
        LocalDateTime mesPassado = LocalDateTime.now().minusMonths(1);

        Pagamento pagamento1 = new Pagamento(asList(bach, poderosas), hoje, paulo);
        Pagamento pagamento2 = new Pagamento(asList(bach, bandeira, amelie), ontem, rodrigo);
        Pagamento pagamento3 = new Pagamento(asList(beauty, vingadores, bach), hoje, adriano);
        Pagamento pagamento4 = new Pagamento(asList(bach, poderosas, amelie), mesPassado, guilherme);
        Pagamento pagamento5 = new Pagamento(asList(beauty, amelie), ontem, paulo);

        List<Pagamento> pagamentos = asList(pagamento1, pagamento2, pagamento3, pagamento4, pagamento5);

        Map<Produto, Long> maisVendidos =
                pagamentos.stream()
                          .flatMap(p -> p.getProdutos().stream())
                          .collect(groupingBy(identity(), counting()));

        maisVendidos.entrySet()
                    .stream()
                    .max(comparing(Map.Entry::getValue))
                    .ifPresent(System.out::println);

    }

}
