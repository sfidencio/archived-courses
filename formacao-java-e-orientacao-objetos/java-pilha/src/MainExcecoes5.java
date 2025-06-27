import pacote.local.Conta;

public class MainExcecoes5 {
    public static void main(String[] args) {
        System.out.println("Inicio Man()");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            if (ex instanceof NullPointerException)
                System.out.println("Voce nao instanciou o objeto: " + Conta.class.getName());
            else if (ex instanceof ArithmeticException)
                System.out.println("Voce fez um divisao ilegal no java");
            else
                System.out.println(ex.getMessage());
        }
        System.out.println("Fim Man()");
    }

    public static void metodo1() {
        System.out.println("Inicio metodo 1");
        metodo2();
        System.out.println("Fim metodo 1");
    }

    private static void metodo2() {
        System.out.println("Inicio metodo 2");
        metodo3();
        System.out.println("Fim metodo 2");
    }

    private static void metodo3() {
        int j = 0;
        Conta conta = null;
        //pacote.local.Conta conta = new pacote.local.Conta();
        System.out.println("Inicio metodo 3");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            j = i / 0;
            //conta.setTitular("Teste");

        }
        System.out.println("Fim metodo 3");
    }
}