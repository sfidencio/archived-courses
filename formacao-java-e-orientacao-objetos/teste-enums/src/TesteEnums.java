/**
 * Testando enums
 * @author sfidencio
 */
public class TesteEnums {
    public static void main(String[] args) throws InterruptedException {
        inicializarThread(Prioridade.MINIMO, "Varrendo casa...");
        inicializarThread(Prioridade.MINIMO, "Lavando Roupas...");
        inicializarThread(Prioridade.MAXIMO, "Cortando grama...");
    }


    public static void inicializarThread(Prioridade p, String mensagem) throws InterruptedException {
        Thread tr = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Processando " + mensagem + " Seq: " + (i+1));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        if (p.equals(Prioridade.MINIMO)) {
            tr.setPriority(Prioridade.MINIMO.getValor());
        } else if (p.equals(Prioridade.MEDIO)) {
            tr.setPriority(Prioridade.MEDIO.getValor());
        } else {
            tr.setPriority(Prioridade.MAXIMO.getValor());
        }
        tr.start();
    }
}


