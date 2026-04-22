package novidades.java9;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Testes {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Novidades Java 9+
        //07/2017
        //Factory Method -- Collections Imutaveis
        List<String> frutas = List.of("Maca", "Pera", "Uva", "Abacate", "Manga", "Melancia", "Melao", "Acerola", "Nectarina", "Pessego");
        frutas.stream().filter(f -> f.startsWith("M")).forEachOrdered(System.out::println);


        var valores = new ArrayList<BigDecimal>(0);
        valores.add(new BigDecimal("2.20"));
        valores.add(new BigDecimal("2.25"));
        System.out.println("Valores: "  + valores);

        // C:\Users\sfidencio\.jdks\openjdk-19.0.1\bin\java.exe .\Testes6.java


        //httpClient consumindo api, foi inserido melhorias
        //HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.
                newBuilder(URI.create("https://airport-info.p.rapidapi.com/airport"))
                .header("X-RapidAPI-Key", "9f4ac3c274mshd682b234e577336p141dfejsn442b12008c45")
                .header("X-RapidAPI-Host", "airport-info.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}
