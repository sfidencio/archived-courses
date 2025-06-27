public class MainTestaContaSemCliente {
    public static void main(String[] args) {
        /*Cliente fulano = new Cliente();
        fulano.nome = "Fulano";
        fulano.cpf = "123456789421";
        fulano.profissao = "Analista de Sistemas";*/

        Conta contaDoFulano = new Conta();
        //contaDoFulano.titular = fulano;
        /*contaDoFulano.titular = new Cliente();
        contaDoFulano.titular.nome = "Fulano";
        contaDoFulano.titular.cpf = "12345678911";*/
        contaDoFulano.deposita(200);
        System.out.println("Saldo da conta do " + contaDoFulano.titular.nome + ": " + contaDoFulano.getSaldo());


    }
}