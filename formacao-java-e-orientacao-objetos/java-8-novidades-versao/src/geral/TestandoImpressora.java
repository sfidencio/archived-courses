package geral;

import defaultmethod.teste.Impressora;
import defaultmethod.teste.ImpressoraFiscal;

public class TestandoImpressora {
    public static void main(String[] args) {
       Impressora impressora = new ImpressoraFiscal();
        impressora.imprimir("NFE");
        System.out.println(impressora.reset(1));


    }
}
