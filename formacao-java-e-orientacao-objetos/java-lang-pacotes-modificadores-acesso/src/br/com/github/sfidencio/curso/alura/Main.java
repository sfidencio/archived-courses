package br.com.github.sfidencio.curso.alura;

import br.com.github.sfidencio.Utils;
import br.com.github.sfidencio.curso.alura.model.*;
import br.com.github.sfidencio.curso.alura.model2.ProdutoPerigoso;
import br.com.github.sfidencio.curso.alura.service.CalculoLimite;

public class Main {
    public static void main(String[] args) throws ErroCalcularImpostoException {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Teste");
        cliente.setCpf("88888888");
        cliente.setLimite(250);
        System.out.println(cliente);


        System.out.println("Calculo de imposto: " + new CalculoLimite().calcularImposto(new Pis()));

        ProdutoPerigoso p1 = new ProdutoPerigoso();
        p1.setId(1L);
        p1.setDescricao("Teste");
        System.out.println(p1);

        //Testando lib
        System.out.println(Utils.completarZerosEsquerda(50,5));

    }
}