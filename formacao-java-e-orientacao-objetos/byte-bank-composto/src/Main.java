public class Main {
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.nome = "Fulano";
        fulano.cpf = "123456789421";
        fulano.profissao = "Analista de Sistemas";

        Conta contaDoFulano = new Conta();
        contaDoFulano.titular = fulano;
        contaDoFulano.deposita(200);
        System.out.println("Saldo da conta do " + contaDoFulano.titular.nome + ": " + contaDoFulano.getSaldo());


    }
}