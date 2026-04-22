import java.io.*;
import java.util.logging.Logger;

public class EscritaArquivo {
    public static Logger logger = Logger.getLogger(EscritaArquivo.class.getName());

    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("distro-linux-saida.txt");
        Writer osw = new OutputStreamWriter(fos);
        Writer brw = new BufferedWriter(osw);

        brw.write("ubuntu;debian;suse\n");
        brw.write("slack;redhat;mandrake\n");
        brw.flush();
        brw.close();

    }
}
