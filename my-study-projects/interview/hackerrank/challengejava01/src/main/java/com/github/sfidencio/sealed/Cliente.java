package com.github.sfidencio.sealed;

public final class Cliente implements IPessoa {
    @Override
    public void exibirTipo() {
        System.out.println("Eu sou um cliente");
    }
}
