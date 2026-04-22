package novidades.java9;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Testes4 {
    public static void main(String[] args) {
        try {
            chamarURL(new URL("http://www.google.com"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void chamarURL(final URL url) throws IOException {
        String[] listaBranca = {"http://www.google.com", "http://www.uol.com.br","http://www.facebook.com"};
        List<String> listaBranca2 = Arrays.asList(listaBranca);
        System.out.println(listaBranca2);

        if (!listaBranca2.contains("http://www.facebook.com"))
            throw new IOException();

        url.openConnection();

    }
}
