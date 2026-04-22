import java.io.*;
import java.nio.Buffer;
import java.util.logging.Logger;

public class EscritaArquivoEntradaTeclado {
    public static Logger logger = Logger.getLogger(EscritaArquivoEntradaTeclado.class.getName());

    public static void main(String[] args) throws IOException {
        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("escrita-entrada-teclado.txt");
        Writer osw = new OutputStreamWriter(fos);
        Writer brw = new BufferedWriter(osw);
        String linha = br.readLine();

        while (linha!=null && !linha.isEmpty()) {
            //System.out.println(linha);
            ((BufferedWriter)brw).write(linha);
            ((BufferedWriter)brw).newLine();
            linha = br.readLine();
        }

        brw.flush();
        brw.close();
        br.close();

    }
}
