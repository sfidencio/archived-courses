package novidades.java9;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;

public class Testes6 {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        String existo = "Oi..";

        Optional<String> torre = Optional.ofNullable(System.getenv("qualquer_coisa"));


        Optional<String> torre2 = Optional.ofNullable(existo);

        Optional<String> torre3 = Optional.ofNullable(null);

        System.out.println(torre.isEmpty());
        System.out.println(torre.isPresent());


        System.out.println();

        System.out.println(torre2.isEmpty());
        System.out.println(torre2.isPresent());


        System.out.println();
        System.out.println();

        System.out.println(torre3.isEmpty());
        System.out.println(torre3.isPresent());

    }
}
