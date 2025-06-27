import java.io.*;
import java.math.BigDecimal;

public class SerializandoEDeserializandoObjetos {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //Transforma objeto em fluxo binario
        //Serializando
        String nome = "Fulano de Tal";
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        objectOutputStream1.writeObject(nome);
        objectOutputStream1.close();

        //Deserializando
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nomeRecuperado = objectInputStream1.readObject().toString();
        System.out.println(nomeRecuperado);


        //Transforma objeto em fluxo binario
        //Serializando
        Produto p1 = new Produto(102030, "Feijao Tropeiro", new BigDecimal("2.20"), new BigDecimal("10"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        objectOutputStream.writeObject(p1);
        objectOutputStream.close();

        //Deserializando
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Produto p2 = (Produto) objectInputStream.readObject();
        System.out.println(p2);

        //Se objeto for serializado com um serialVersionUID (observe que e estatico),
        //e tentar recuperar na mesma classe com versao dferente teremos uma
        //Exception do tipo java.io.InvalidClassException


        PessoaFisicaImpl pessoaFisica = new PessoaFisicaImpl();
        pessoaFisica.setNome("Fulano de Tal");
        pessoaFisica.setEndereco(new Endereco("Rua do amor fraterno","75020460"));
        pessoaFisica.setLimiteCredito(256.69);
        pessoaFisica.setIdade(55);
        pessoaFisica.setCpf("88888888888");

        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("pessoa-heranca.bin"));
        objectOutputStream2.writeObject(pessoaFisica);
        objectOutputStream2.close();

        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("pessoa-heranca.bin"));
        Pessoa pessoa3 = (Pessoa) objectInputStream2.readObject();
        System.out.println(pessoa3);




    }
}
