package defaultmethod.teste;

public class ImpressoraImp implements Impressora2 {
    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimindo: " + texto);
        visualizar("Visualizando :" + texto);
    }
}
