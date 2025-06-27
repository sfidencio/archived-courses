import java.io.*;
import java.nio.charset.Charset;

public class LendoArquivoEncoding1 {
    public static void main(String[] args) throws IOException {
        //FileReader fileReader = new FileReader("texto-encoding-ISO-8859-1.txt", Charset.forName("ISO-8859-1"));
        FileReader fileReader = new FileReader("texto-encoding-ISO-8859-1.txt", Charset.forName("UTF-8"));

        System.out.println("Encoding: " +  fileReader.getEncoding());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = bufferedReader.readLine();
        while (linha != null){
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
    }
}
