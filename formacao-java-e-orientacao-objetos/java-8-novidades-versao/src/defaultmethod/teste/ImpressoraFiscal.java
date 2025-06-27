package defaultmethod.teste;

public class ImpressoraFiscal implements Impressora {
    @Override
    public void imprimir(String conteudo) {
        System.out.println("Imprimindo cupom fiscal");
        System.out.println(conteudo);
    }
}
