public class EstudoThreadSafe {
    public static void main(String[] args) {
        GerenciadorSemaforoT1 t1 = new GerenciadorSemaforoT1();
        t1.start();
    }
}
