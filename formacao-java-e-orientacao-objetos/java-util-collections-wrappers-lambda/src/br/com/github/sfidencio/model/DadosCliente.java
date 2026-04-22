package br.com.github.sfidencio.model;

public class DadosCliente {
    private String numeroCartao;
    private String numeroConta;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public DadosCliente() {
    }

    public DadosCliente(String numeroCartao, String numeroConta) {
        this.numeroCartao = numeroCartao;
        this.numeroConta = numeroConta;
    }
}
