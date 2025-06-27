package br.com.github.sfidencio.model;

import br.com.github.sfidencio.model.Conta;

public class GuardadorReferencias {

    private int posicaoLivre = 0;
    private Object[] contas = new Object[3];


    public void adicionar(Conta ref) {
        if (this.posicaoLivre > this.contas.length - 1)
            throw new RuntimeException("Posicao para armazenar conta indisponivel.");
        this.contas[posicaoLivre] = ref;
        this.posicaoLivre++;
    }

}
