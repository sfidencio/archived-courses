package com.github.sfidencio.testemodule;

import module app.main;

public class CartaoCredito {
    private String numero;
    private String nomeTitular;
    private String dataValidade;
    private String codigoSeguranca;

    public CartaoCredito(String numero, String nomeTitular, String dataValidade, String codigoSeguranca) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
