package com.github.sfidencio.destruturandorecords;

public class Main {
    static void main() {
        var cartao = new Cartao("1234 5678 9012 3456", "Sebastiao", "12/24");
        exibirDadosCartao(cartao);
    }

    private static void exibirDadosCartao(Cartao cartao) {
        switch (cartao){
            case Cartao(String numero, String nome, String validade) when validade.equals("12/24") ->
                    System.out.println("Cartao valido: " + numero + ", Nome: " + nome + ", Validade: " + validade);
            case Cartao(String numero, String nome, String validade) ->
                    System.out.println("Cartao invalido: " + numero + ", Nome: " + nome + ", Validade: " + validade);
            default -> System.out.println("Cartao desconhecido");
        }
    }

    record Cartao(String numero, String nome, String validade) {
    }
}
