package vbl.java.lambda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pagamento {

    private List<Produto> produtos;
    private LocalDateTime data;
    private Cliente cliente;

    public Pagamento(List<Produto> produtos, LocalDateTime data, Cliente cliente) {

        this.produtos = produtos;
        this.data = data;
        this.cliente = cliente;

    }

    public List<Produto> getProdutos() {return this.produtos;}
    public LocalDateTime getData() {return this.data;}
    public Cliente getCliente() {return this.cliente;}

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[Pagamento: ")
                .append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .append(", ")
                .append(getCliente())
                .append(", ")
                .append(getProdutos())
                .append("]");

        return sb.toString();

    }

}
