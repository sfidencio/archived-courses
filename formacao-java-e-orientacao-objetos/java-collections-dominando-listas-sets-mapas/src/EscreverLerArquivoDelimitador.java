import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Logger;

public class EscreverLerArquivoDelimitador {
    public static Logger logger = Logger.getLogger(EscreverLerArquivoDelimitador.class.getName());


    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
            escreverArquivo(100);
            List<ProdutoModelo> produtoModelos = lerArquivo();
            produtoModelos.forEach(item->{
                System.out.println(item.getCodigo() + "\t\t" + item.getDescricao() +"\t\t" + item.getPreco() + "\t\t" + item.getEstoque());
            });
        } catch (IOException e) {
            logger.info("Erro ao ler arquivo de produtos: " + e.getMessage());
        }
    }

    private static List<ProdutoModelo> lerArquivo() throws IOException {
        List<ProdutoModelo> produtos = new ArrayList<>(0);
        Reader reader = new FileReader("massa-produtos.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linha = bufferedReader.readLine();
        while (linha != null) {
            String[] registro = linha.split("\\|");
            produtos.add(new ProdutoModelo(Integer.parseInt(registro[0]),registro[1],new BigDecimal(registro[2]),Integer.parseInt(registro[3])));
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
        reader.close();
        return produtos;
    }

    private static void escreverArquivo(int qtdReg) throws IOException {
        Writer writer = new FileWriter("massa-produtos.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for (int i = 1; i <= qtdReg; i++)
            bufferedWriter.write(String.format("%06d", i) + "|Produto nº" + i + "|" + String.format("%.2f", new Random().nextDouble() * 100) + "|" + Math.abs(new Random().nextInt(95)) + "\n");
        bufferedWriter.close();
        writer.close();
    }

}

class ProdutoModelo {
    private Integer codigo;
    private String descricao;
    private BigDecimal preco;
    private Integer estoque;

    public ProdutoModelo(Integer codigo, String descricao, BigDecimal preco, Integer estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getEstoque() {
        return estoque;
    }


    @Override
    public String toString() {
        return "ProdutoModelo{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}



