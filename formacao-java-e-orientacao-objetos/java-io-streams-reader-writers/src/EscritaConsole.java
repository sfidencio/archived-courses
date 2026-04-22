import java.io.IOException;
import java.io.OutputStream;

public class EscritaConsole {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        os.write("Teste Escrita".getBytes());
    }
}
