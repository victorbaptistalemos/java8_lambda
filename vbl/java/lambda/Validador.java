package vbl.java.lambda;

@FunctionalInterface
public interface Validador<T> {

  public boolean valida(T t);

}
