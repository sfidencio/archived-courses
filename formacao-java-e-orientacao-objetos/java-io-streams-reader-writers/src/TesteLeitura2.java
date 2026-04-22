import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class TesteLeitura2 {
    public static Logger logger = Logger.getLogger(TesteLeitura2.class.getName());

    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("usuarios.txt");
        Reader reader = new InputStreamReader(fis);
        Reader br = new BufferedReader(reader);
        String linha=((BufferedReader)br).readLine();
       if(br.ready()) {
           while (linha!=null) {
               System.out.println(linha);
               linha = ((BufferedReader) br).readLine();
           }
       }
    }
}
