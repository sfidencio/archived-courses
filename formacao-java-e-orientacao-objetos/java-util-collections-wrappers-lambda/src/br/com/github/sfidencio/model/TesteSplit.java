package br.com.github.sfidencio.model;

import java.util.HashSet;
import java.util.Set;

public class TesteSplit {
    public static void main(String[] args) {
        Set<DadosCliente> listaClientes = new HashSet<>(0);
        DadosCliente dadosCliente = null;

        String contasCartoes = "";
        String numeroCartoes = "#1425387497412543#1425387497412543#";

        String teste = String.format("Fulano: %s, %s, %s","Joao","Fidencio","Talita");
        System.out.println(teste);

        String[] contasCartoesQuebradas = contasCartoes.split("#");
        String[] numeroCartoesQuebrados = numeroCartoes.split("#");

        for (int i = 0; i < contasCartoesQuebradas.length; i++) {
            if (!(contasCartoesQuebradas[i].length() == 0)) {
                dadosCliente = new DadosCliente(numeroCartoesQuebrados[i], contasCartoesQuebradas[i]);
                listaClientes.add(dadosCliente);
            }
        }

        listaClientes.forEach(item-> {
            System.out.println(item.getNumeroCartao() + "-" +  item.getNumeroConta());
        });

    }
}
