package novidades.java9;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Testes5 {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        System.out.println();
        URL url = new URL("http://www.google.com:80");

        URI uri = new URI(url.toString());


        System.out.println(uri);
        System.out.println(uri.getHost());
        System.out.println(uri.getPort());

        uri.toURL();

        System.out.println(Testes5.class.getSimpleName());
        System.out.println(Testes5.class.getName());
    }
}
