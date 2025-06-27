public class TabuadaMain {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Tabuada de: " + i);
            for (int x = 0; x <= 9; x++)
                System.out.println(i + " x " + x + " = " + (i * x));
            System.out.println();
        }
    }
}

