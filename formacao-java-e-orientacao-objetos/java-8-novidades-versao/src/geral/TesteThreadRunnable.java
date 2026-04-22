package geral;

public class TesteThreadRunnable {
    public static void main(String[] args) {

        //Podemos utilizar uma lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("teste");
            }
        }).start();


        new Thread(() -> System.out.println("Executando thread in lambda")).start();

    }
}
