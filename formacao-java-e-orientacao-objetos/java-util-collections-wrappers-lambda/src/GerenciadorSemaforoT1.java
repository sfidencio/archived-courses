import br.com.github.sfidencio.model.Semaforo;

public class GerenciadorSemaforoT1 extends Thread {
    private Semaforo semaforo;

    public GerenciadorSemaforoT1() {
        this.semaforo = Semaforo.VERDE;
    }

    @Override
    public void run() {
        try {
            trocarSinal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public void trocarSinal() throws InterruptedException {
        if (this.semaforo.equals(Semaforo.VERDE)) {
            this.semaforo = Semaforo.AMARELO;
            System.out.println("Selecionado: " + this.semaforo);
            Thread.sleep(5000);

        }
        if (this.semaforo.equals(Semaforo.AMARELO)) {
            this.semaforo = Semaforo.VERMELHO;
            System.out.println("Selecionado: " + this.semaforo);
            Thread.sleep(5000);

        }
        if (this.semaforo.equals(Semaforo.VERMELHO)) {
            this.semaforo = Semaforo.VERDE;
            System.out.println("Selecionado: " + this.semaforo);
            Thread.sleep(5000);
        }
    }
}
