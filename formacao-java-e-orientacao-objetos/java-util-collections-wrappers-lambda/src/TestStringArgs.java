public class TestStringArgs {
    public static void main(String[] args) {
        for (int i = 1; i <= args.length; i++) {
            System.out.println("Posicao: " + i + " Valor: " + args[i-1]);
        }
    }
}
