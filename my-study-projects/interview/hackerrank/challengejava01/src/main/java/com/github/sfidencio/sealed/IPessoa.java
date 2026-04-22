package com.github.sfidencio.sealed;

public sealed interface IPessoa permits Cliente {
    void exibirTipo();
}
