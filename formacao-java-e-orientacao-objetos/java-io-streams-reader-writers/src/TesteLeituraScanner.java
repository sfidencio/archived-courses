import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("usuarios.txt"));
        while (scanner.hasNext()) {
            String[] valores = scanner.nextLine().split(";");
            for (int i = 0; i < valores.length; i++) {
                System.out.println("Valor: " + valores[i]);
            }
        }


        Scanner scanner2 = new Scanner(new File("relatorio-bruto.txt"));
        while (scanner2.hasNext()) {
            Scanner scanner3 = new Scanner(scanner2.nextLine());
            scanner3.useDelimiter("\\|");
            System.out.println(scanner3.next());
            System.out.println(scanner3.next());
            System.out.println(scanner3.next());
            System.out.println(scanner3.next());
            scanner3.close();
        }
        scanner2.close();
    }
}
