package pacote.local2;

public class TesteConexao {
    public static void main(String[] args) {
        Conexao conexao = null;
        try {
            conexao = new Conexao();
            conexao.abrirConexao();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }finally {
            conexao.fecharConexao();
        }

    }
}
