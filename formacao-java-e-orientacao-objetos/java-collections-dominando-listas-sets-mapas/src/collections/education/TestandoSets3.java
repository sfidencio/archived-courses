package collections.education;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class TestandoSets3 {
    public static void main(String[] args) throws IOException {
        escreverMassa(100);
        System.out.println();
        System.out.println("Lendo arquivo e inserindo em HashSet, em seguida importar para um ArrayList.");
        List<ClienteMassa> clienteMassaList = new ArrayList<>(obterClientes());
        System.out.println();
        System.out.println("Ordenando do Maior Preco para o Menor");
        //Collections.sort(clienteMassaList, Comparator.comparing(curso.ClienteMassa::getLimite).reversed());
        //Collections.sort(clienteMassaList);
        //Collections.reverse(clienteMassaList);
        //clienteMassaList.sort(Comparator.reverseOrder());
        //clienteMassaList.sort(Comparator.naturalOrder());
        clienteMassaList.sort((Comparator.comparing(ClienteMassa::getLimite).reversed()));
        System.out.println("--Relatorio-Clientes | Maior Preco---");
        System.out.println("Codigo\t|Nome\t\t\t|\tLimite\t|");
        clienteMassaList.forEach(item -> {
            System.out.println(String.format("%03d", item.getCodigo()) + "\t\t|\t" + item.getNome() + "\t|\t" + item.getLimite() + "\t" + "|");
        });

        System.out.println();
        System.out.println();

        clienteMassaList.sort((Comparator.comparing(ClienteMassa::getLimite)));
        System.out.println("--Relatorio-Clientes | Menor Preco---");
        System.out.println("Codigo\t|Nome\t\t\t|\tLimite\t|");
        clienteMassaList.forEach(item -> {
            System.out.println(String.format("%03d", item.getCodigo()) + "\t\t|\t" + item.getNome() + "\t|\t" + item.getLimite() + "\t" + "|");
        });

        System.out.println();
        System.out.println();
        clienteMassaList.sort((Comparator.comparing(ClienteMassa::getCodigo).reversed()));
        System.out.println("--Relatorio-Clientes | Maior Codigo---");
        System.out.println("Codigo\t|Nome\t\t\t|\tLimite\t|");
        clienteMassaList.forEach(item -> {
            System.out.println(String.format("%03d", item.getCodigo()) + "\t\t|\t" + item.getNome() + "\t|\t" + item.getLimite() + "\t" + "|");
        });


    }

    public static void escreverMassa(Integer qtdReg) throws IOException {
        if (qtdReg <= 0 || qtdReg > 10000)
            throw new IllegalArgumentException("Argumento de entrada inválido.");
        Locale.setDefault(Locale.US);
        //Gerar arquivo
        Writer fw = new FileWriter("massa.txt");
        for (int i = 1; i <= qtdReg; i++) {
            fw.write(i + ";curso.Cliente " + i + ";" + String.format("%.2f", new Random().nextDouble() * 10) + "\n");
            System.out.println("Escrevendo linha: " + i);
        }
        fw.close();
    }

    public static Set<ClienteMassa> obterClientes() throws IOException {
        Reader fr = new FileReader("massa.txt");
        BufferedReader br = new BufferedReader(fr);
        String linha = br.readLine();
        String[] registros = null;
        Set<ClienteMassa> clienteMassas = new HashSet<>();
        while (linha != null) {
            registros = linha.split(";");
            clienteMassas.add(new ClienteMassa(Integer.parseInt(registros[0]), registros[1], new BigDecimal(registros[2])));
            linha = br.readLine();
        }
        br.close();
        fr.close();
        return clienteMassas;
    }
}


class ClienteMassa /*implements Comparable<curso.ClienteMassa>*/ {
    private Integer codigo;
    private String nome;
    private BigDecimal limite;

    public ClienteMassa(Integer codigo, String nome, BigDecimal limite) {
        this.codigo = codigo;
        this.nome = nome;
        this.limite = limite;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "curso.ClienteMassa{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", limite=" + limite +
                '}';
    }

    /*@Override
    public int compareTo(curso.ClienteMassa o) {
        return this.getLimite().compareTo(o.getLimite());
    }*/
}
