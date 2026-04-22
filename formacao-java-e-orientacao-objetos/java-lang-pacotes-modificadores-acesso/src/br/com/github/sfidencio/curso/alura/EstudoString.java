package br.com.github.sfidencio.curso.alura;

import br.com.github.sfidencio.curso.alura.model.Cliente;

public class EstudoString {
    public static void main(String[] args) {
        //Lembre-se, String é imutável, por isso ao fazer replace ou qualquer outra
        //modificação na String, a mesma retorna uma nova string.
        String nome = "Sebastiao Fidencio da Xilva Pereira";
        nome.replace("X", "S");
        nome.toUpperCase();
        System.out.println(nome);
        System.out.println();
        String nome2 = "Sebastiao Fidencio da Xilva Pereira";
        String nomeModificado = nome.replace("X", "S");
        String nomeModificado2 = nomeModificado.toUpperCase();
        System.out.println(nomeModificado2);
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Teste");
        cliente.setCpf("888888888");
        cliente.setLimite(20.0);
        Cliente client2 = cliente ;
        System.out.println(client2);
        client2.setLimite(40.2);
        System.out.println(client2);
        System.out.println(cliente);

        System.out.println();
        System.out.println();
        System.out.println();
        try {
            Cliente cliente3 = (Cliente) client2.clone();
            System.out.println(cliente3);
            cliente3.setLimite(40.3);
            System.out.println(cliente3);
            System.out.println(client2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }




        String s2 = new String();
        s2 = "Teste";
        String s1 = "Amigo";



    }
}
