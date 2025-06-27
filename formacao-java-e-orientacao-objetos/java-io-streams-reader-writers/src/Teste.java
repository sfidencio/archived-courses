public class Teste {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("258dx"); //runtime..
            System.out.println(x);
        }catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
