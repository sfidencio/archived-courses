import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/*
 *https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
 */
public class TesteLeituraScanner2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(new File("relatorio-bruto2.txt"));
        while (scanner2.hasNext()) {
            Scanner scanner3 = new Scanner(scanner2.nextLine());
            scanner3.useDelimiter(";");

            //Forcando regionalismo, ou seja..
            //aceitar o separador de decimais do numero inteiro "." ao inves de "," por conta do brasil.
            scanner3.useLocale(Locale.US);

            Integer codigo = scanner3.nextInt();
            String descricao = scanner3.next();
            Double preco = scanner3.nextDouble();

            System.out.println("Codigo: (Formatacao)" + String.format("%+08d",codigo)); //colocar 20 posicoes contando com zero  a esquerda
            System.out.println("Codigo: " + codigo);
            System.out.println("Descricao: " + descricao);
            System.out.println("Preco: " + String.format("%.3f",preco));
            System.out.println("Preco (Sem formatacao): " +preco);
            System.out.println("Preco (Locale difere): " + String.format(Locale.JAPANESE,"%.2f",preco));
            //System.out.println("Teste: " + scanner3.next()); //se tentar acessar elemento inexistente
            System.out.println();

            System.out.println("Valores Concatenados: " + String.format("%nCodigo: %s %nDescricao: %s %nValor: %.2f",codigo,descricao,preco));

            scanner3.close();
        }
        scanner2.close();
    }
}
