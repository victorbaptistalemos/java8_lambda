package vbl.java.lambda;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Assinatura {

    private BigDecimal taxaMensal;
    private LocalDateTime dataInicio;
    private Optional<LocalDateTime> dataFim;
    private Cliente cliente;

    public Assinatura(BigDecimal taxaMensal, LocalDateTime dataInicio, Cliente cliente) {

        this.taxaMensal = taxaMensal;
        this.dataInicio = dataInicio;
        this.dataFim = Optional.empty();
        this.cliente = cliente;

    }

    public Assinatura(BigDecimal taxaMensal, LocalDateTime dataInicio, LocalDateTime dataFim, Cliente cliente) {

        this.taxaMensal = taxaMensal;
        this.dataInicio = dataInicio;
        this.dataFim = Optional.of(dataFim);
        this.cliente = cliente;

    }

    public BigDecimal getTotalPago() {

        return getTaxaMensal().multiply(
                new BigDecimal(
                        ChronoUnit.MONTHS.between(getDataInicio(),
                        getDataFim().orElse(LocalDateTime.now()))));

    }



    public BigDecimal getTaxaMensal() {return this.taxaMensal;}
    public LocalDateTime getDataInicio() {return this.dataInicio;}
    public Optional<LocalDateTime> getDataFim() {return this.dataFim;}
    public Cliente getCliente() {return this.cliente;}

}
