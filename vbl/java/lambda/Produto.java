package vbl.java.lambda;

import java.math.BigDecimal;
import java.nio.file.Path;

public class Produto {

    private String nome;
    private Path caminho;
    private BigDecimal preco;

    public Produto(String nome, Path caminho, BigDecimal preco) {

        this.nome = nome;
        this.caminho = caminho;
        this.preco = preco;

    }

    public String getNome() {return this.nome;}
    public Path getCaminho() {return this.caminho;}
    public BigDecimal getPreco() {return this.preco;}

    @Override
    public String toString() {return this.nome;}

}
