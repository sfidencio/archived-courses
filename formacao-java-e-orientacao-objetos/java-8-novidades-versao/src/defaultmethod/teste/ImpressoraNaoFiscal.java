package defaultmethod.teste;

public class ImpressoraNaoFiscal implements Impressora {
    @Override
    public void imprimir(String conteudo) {
        System.out.println("Imprimindo cupom nao fiscal");
        System.out.println(conteudo);
    }


}
