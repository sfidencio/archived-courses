import java.io.FileWriter;
import java.io.IOException;

public class MedicaoTempoEscrita {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("escrita-medicao.txt");
        long tempoInicial = System.currentTimeMillis();
        for (int i = 1; i <= 50000 ; i++) {
            fileWriter.write("Posicao: " + i);
            fileWriter.write(System.lineSeparator());
        }
        fileWriter.write(System.lineSeparator());
        fileWriter.close();
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (tempoFinal-tempoInicial));
    }
}
