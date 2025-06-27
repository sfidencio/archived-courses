import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class TesteLeitura {
    public static Logger logger = Logger.getLogger(TesteLeitura.class.getName());

    public static void main(String[] args) {
        InputStream fis = null; //inputStream é classe mae
        try {
            fis = new FileInputStream("usuarios.txt"); //Fluxo binario ou em bytes
            Reader isr = new InputStreamReader(fis, StandardCharsets.UTF_8); //Binario/bytes para Caracteres
            Reader br = new BufferedReader(isr);//Finalmente lendo os caracteres por linha

            //Temos acima a implementaçao do padrao decorator, um objeto melhorando a implementacao do outro..


            String linha = ((BufferedReader) br).readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = ((BufferedReader) br).readLine();
            }

            br.close();
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        } catch (IOException e) {
            logger.info(e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    logger.info(e.getMessage());
                }
            }
        }
    }
}
