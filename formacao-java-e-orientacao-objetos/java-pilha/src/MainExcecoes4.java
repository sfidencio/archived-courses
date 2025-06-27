public class MainExcecoes4 {
    public static void main(String[] args) {
        System.out.println("Inicio Man()");
        try {
            metodo1();
        } catch (ArithmeticException ex) {
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
        System.out.println("Inicio metodo 3");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            j = i / 0;
        }
        System.out.println("Fim metodo 3");
    }
}