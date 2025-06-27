import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class LendoArquivoCharset {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("contas.txt"),"windows-1252");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();


        //Reader reader = new FileReader(new File("contas.txt"));
        //Lendo um arquivo windows-1252 - o charset default é
        System.out.println();
        System.out.println();
        System.out.println("Charset Default do SO é: "  + Charset.defaultCharset());
        System.out.println("Forcando charset do arquivo, que e windows-1252");
        Reader reader = new FileReader(new File("contas.txt"), Charset.forName("windows-1252"));
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linha = bufferedReader.readLine();
        while(linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }

    }
}
