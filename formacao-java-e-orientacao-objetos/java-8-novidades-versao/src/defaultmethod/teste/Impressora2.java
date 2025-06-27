package defaultmethod.teste;

public interface Impressora2 {
    void imprimir(String texto);
    default void visualizar(String texto) {
        System.out.println(texto);
    }
}
