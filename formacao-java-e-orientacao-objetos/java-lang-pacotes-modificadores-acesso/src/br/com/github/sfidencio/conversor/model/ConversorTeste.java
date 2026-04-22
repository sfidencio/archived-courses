package br.com.github.sfidencio.conversor.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConversorTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        List<Cliente> registros = new ArrayList<>(0);
        List<Cliente> registrosRecuperados = new ArrayList<>(0);
        //List<Contato> registrosFilhosRecuperados = new ArrayList<>(0);
        c1.setId(1);
        c1.setNome("Fidencio");
        c1.getContatos().add(new Contato(1, "Renato", "renato@gmail.com"));
        c1.getContatos().add(new Contato(2, "Alavason", "alvason@gmail.com"));

        Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("Giselly");
        c2.getContatos().add(new Contato(1, "Diogo", "diogo@gmail.com"));
        c2.getContatos().add(new Contato(2, "Andrey", "andrey@gmail.com"));

        System.out.println(c1);
        System.out.println();
        System.out.println(c2);

        registros.add(c1);
        registros.add(c2);

        String registro = "";
        String registroBackup = "";
        int z = 0;
        for (int i = 0; i < registros.size(); i++) {
            z++;
            //Converter
            registro += registros.get(i).getId() + "-" + registros.get(i).getNome() + "-";


            if (registros.get(i).getContatos() != null) {
                int j = 0;
                for (int x = 0; x < registros.get(i).getContatos().size(); x++) {
                    j++;
                    registro += "#" + registros.get(i).getContatos().get(x).getId() + "#" + registros.get(i).getContatos().get(x).getNome() + "#" + registros.get(i).getContatos().get(x).getEmail();

                    if (j < registros.get(i).getContatos().size())
                        registro += "&";
                }
            }
            if (z < registros.size())
                registro += "|";
        }

        System.out.println(registro);

        String[] inserirHbase = registro.split("\\|");

        for (int j = 0; j < inserirHbase.length; j++)
            TabelaHbase.add((j + 1), inserirHbase[j]);


        System.out.println();

        for (Map.Entry<Integer, String> entry : TabelaHbase.list().entrySet())
            System.out.println("Chave: " + entry.getKey() + " Valor: " + entry.getValue());


        System.out.println();
        //Montando objeto
        Cliente objClienteMontado = null;
        Contato objContatoMontado = null;
        for (Map.Entry<Integer, String> entry : TabelaHbase.list().entrySet()) {
            //System.out.println("Chave: " + entry.getKey() + " Valor: " + entry.getValue());
            String valor = entry.getValue();
            String[] valorArray = valor.split("-");
            objClienteMontado = new Cliente();
            objClienteMontado.setId(entry.getKey());
            objClienteMontado.setNome(valorArray[1]);
            //registrosRecuperados.add(objClienteMontado);

            valor = valor.substring(valor.indexOf("#"));
            String[] valorArrayFilhos = valor.split("&");

            for (int j = 0; j < valorArrayFilhos.length; j++) {
                String[] campo = valorArrayFilhos[j].split("#");
                objContatoMontado = new Contato(Integer.parseInt(campo[1]),campo[2],campo[3]);
                //registrosFilhosRecuperados.add(objContatoMontado);
                objClienteMontado.getContatos().add(objContatoMontado);
            }

            registrosRecuperados.add(objClienteMontado);


        }

        System.out.println();
        for (Cliente registrosRecuperado : registrosRecuperados) {
            System.out.println(registrosRecuperado);
        }


    }
}
