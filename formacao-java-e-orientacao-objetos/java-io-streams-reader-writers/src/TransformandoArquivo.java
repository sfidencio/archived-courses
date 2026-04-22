import com.google.gson.Gson;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransformandoArquivo {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("relatorio-bruto.txt");
        Reader isr = new InputStreamReader(is);
        Reader br = new BufferedReader(isr);
        Produto produto = null;
        List<Produto> listaProdutos = new ArrayList<>(0);

        OutputStream os = new FileOutputStream("relatorio-final.json");
        Writer osw = new OutputStreamWriter(os);
        Writer bw = new BufferedWriter(osw);

        if (br.ready()) {
            String linha = ((BufferedReader) br).readLine();
            int contador = 0;
            while (linha != null) {
                contador++;
                linha = ((BufferedReader) br).readLine();
                if (contador > 0 && linha != null) {
                    String[] campos = linha.split("\\|");
                    produto = new Produto(Integer.parseInt(campos[0]),campos[1],new BigDecimal(campos[2]),new BigDecimal(campos[3]));
                    listaProdutos.add(produto);
                }
            }
        }

        //Transformando em JSON tambem
        Gson gson = new Gson();
        String json = gson.toJson(listaProdutos);
        bw.write(json);
        bw.flush();
        bw.close();

        InputStream isJson = new FileInputStream("relatorio-final.json");
        Reader isrJson = new InputStreamReader(isJson);
        Reader brJson = new BufferedReader(isrJson);

        String jsonRead = ((BufferedReader)brJson).readLine();

        System.out.println(jsonRead);

    }
}
