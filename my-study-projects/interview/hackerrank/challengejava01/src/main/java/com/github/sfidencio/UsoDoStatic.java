package com.github.sfidencio;

public class UsoDoStatic {
    public final static int IDADE_FIXA = 10;
    public static int CONTADOR=0;

    public static int getIdadeFixa() {
        return IDADE_FIXA;
    }

    public static int incrementarContator() {
        return ++CONTADOR;
    }
}
