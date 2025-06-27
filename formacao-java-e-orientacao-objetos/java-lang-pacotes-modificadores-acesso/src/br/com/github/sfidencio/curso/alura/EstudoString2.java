package br.com.github.sfidencio.curso.alura;

import br.com.github.sfidencio.curso.alura.model.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstudoString2 {
    public static void main(String[] args) throws Exception {
        String palavra = "Sebastiao Fidencio";
        String palavraMaiuscula = palavra.toUpperCase();
        System.out.println(palavraMaiuscula);

        String palavra2 = "Sofia Vitoria";
        String palavraMinuscula = palavra2.toLowerCase();
        System.out.println(palavraMinuscula);

        char teste = 'A';
        String valor = "Amigo";
        System.out.println(valor.replace("m", "x"));

        String letra = String.valueOf(valor.charAt(0));
        //System.out.println(letra);

        for (int i = 0; i < valor.length(); i++)
            System.out.println(valor.charAt(i));

        System.out.println();
        System.out.println();

        //Ordenando
        for (int i = valor.length() - 1; i >= 0; i--)
            System.out.println(valor.charAt(i));

        //Tabulando
        for (int i = 0; i < valor.length(); i++)
            System.out.println(valor.charAt(i));
        System.out.println();

        //Pesquisando
        System.out.println(valor.indexOf("go"));

        //Replace
        System.out.println(valor.replace("Ami","Agi"));

        if(valor.contains("go"))
            System.out.println("OK1");

        if(valor.startsWith("Am"))
            System.out.println("OK2");


        System.out.println(valor);

        String novo ="";
        if(novo.isEmpty())
            System.out.println("vazio");


        String novo2 ="Aninha";
        if(novo2.isEmpty())
            System.out.println(novo2);

        String novo3 = "Joao,Carlos,Vera";
        String[] quebraNovo3 = novo3.split(",");
        for (int i = 0; i < quebraNovo3.length; i++) {
            System.out.println(quebraNovo3[i]);
        }
        System.out.println();
        System.out.println();
        Map<Double, Cliente> registro = new HashMap<>(0);
        registro.put(1d,new Cliente(1l,"teste1","123456789",20.0));
        registro.put(2d,new Cliente(2l,"teste2","123456789",20.0));
        registro.put(3d,new Cliente(3l,"teste3","123456789",20.0));

        for(Map.Entry<Double,Cliente> item: registro.entrySet()) {
            System.out.println(item.getKey());
        }


        Double chave = registro.keySet().stream().filter(item -> item.equals(2d)).findFirst().get();
        System.out.println("Chave: " + chave);

        Cliente objCliente  = registro.values().stream().filter(item-> item.getId().equals(3l)).findFirst().orElseThrow(() -> new Exception("Nao encontrado!"));
        System.out.println(objCliente);



        StringBuilder sb = new StringBuilder();
        sb.append("Vovo verá é ");
        sb.append("Muito legal");
        System.out.println(sb);

        System.out.println();

        StringBuilder sbSQL = new StringBuilder();
        sbSQL.append("SELECT p1.prod_codigo,");
        sbSQL.append("p1.prod_descricao");
        sbSQL.append("p2.prod_prvenda ");
        sbSQL.append("FROM produtos p1 ");
        sbSQL.append("WHERE p1.prod_codigo = ?");
        System.out.println(sbSQL);

        CharSequence s = "Time";
        System.out.println(s);







    }
}
