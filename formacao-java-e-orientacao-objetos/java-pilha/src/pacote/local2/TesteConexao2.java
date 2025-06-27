package pacote.local2;

public class TesteConexao2 {
    public static void main(String[] args) {
        try (Conexao conexao = new Conexao()) {
            conexao.abrirConexao();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
