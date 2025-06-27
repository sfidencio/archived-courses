package br.com.github.sfidencio.conversor.model;

import java.util.HashMap;
import java.util.Map;

public class TabelaHbase {

    private static Map<Integer, String> dados = new HashMap<>();

    public static void add(int chave, String valor) {
        dados.put(chave, valor);
    }

    public static Map<Integer,String> list() {
        return dados;
    }
}
