package br.com.github.sfidencio;

public class Utils {
    public static String completarZerosEsquerda(int numero, int qtd) {
        return String.format("%0" + qtd + "d", numero);
    }
}
