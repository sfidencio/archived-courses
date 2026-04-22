/*
 *Exemplo de uso do ENUM.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Thread.MAX_PRIORITY);
        Thread thread = new Thread(() ->
            System.out.println("Is Running...")
        );

        thread.setPriority(Thread.MAX_PRIORITY) ;
        thread.start();

    }
}