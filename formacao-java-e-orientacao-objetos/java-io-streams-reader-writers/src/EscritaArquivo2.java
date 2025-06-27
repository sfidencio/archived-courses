import java.io.*;
import java.util.logging.Logger;

public class EscritaArquivo2 {
    public static Logger logger = Logger.getLogger(EscritaArquivo2.class.getName());

    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("distro-linux-saida2.txt");
        Writer osw = new OutputStreamWriter(fos);
        Writer brw = new BufferedWriter(osw);

        ((BufferedWriter)brw).write("ubuntu;debian;suse");
        ((BufferedWriter)brw).newLine();
        ((BufferedWriter)brw).write("slack;redhat;mandrake");
        ((BufferedWriter)brw).newLine();
        ((BufferedWriter)brw).flush();
        ((BufferedWriter)brw).close();

    }
}
