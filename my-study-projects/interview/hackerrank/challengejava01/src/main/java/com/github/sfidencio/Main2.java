package com.github.sfidencio;

import com.github.sfidencio.modificadoracesso.Pessoa;

public class Main2 {
    static void main() {
        Pessoa pessoa = new Pessoa();
        //Acesso não permitido, pois está em outro pacote
        //pessoa.nome = "Fulano";
    }
}
