package pacote.local2;

public class Conexao implements  AutoCloseable {


    public Conexao() throws IllegalAccessException {
        //throw  new IllegalAccessException("Erro ao criar objeto de conexao!");
    }

    public void abrirConexao() throws IllegalAccessException {
        System.out.println("Abrindo conexao!");
        //throw  new IllegalAccessException("Erro ao abrir conexao!");
    }

    public void fecharConexao() {
        System.out.println("Fechando conexão!");
    }

    @Override
    public void close() {
        this.fecharConexao();
    }
}
