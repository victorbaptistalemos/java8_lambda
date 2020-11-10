package vbl.java.lambda;

import java.util.function.IntSupplier;

public class Fibonacci implements IntSupplier {

    private int anterior = 0;
    private int proximo = 1;

    public int getAsInt() {
        proximo += anterior;
        anterior *= -1;
        anterior += proximo;

        return anterior;

    }
}
