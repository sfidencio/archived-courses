package com.github.sfidencio.modificadoracesso;


import com.github.sfidencio.ConsumindoStatic;
import com.github.sfidencio.UsoDoStatic;

public class Main {
    static void main() {
        Pessoa pessoa1 = new Pessoa();
        //Acesso permitido, pois está no mesmo pacote
        pessoa1.nome = "Fulano";

        System.out.println(pessoa1.nome);

        Pessoa pessoa2 = new Pessoa();
        //Acesso permitido, pois está no mesmo pacote
        pessoa2.nome = "Ciclano";
        System.out.println(pessoa2.nome);

        System.out.println("Idade fixa: " + UsoDoStatic.IDADE_FIXA);
    }
}
