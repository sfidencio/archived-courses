public class MainTestaMetodoTransfere {
    public static void main(String[] args) {
        Conta contaDoFulano = new Conta();
        contaDoFulano.titular = "Fulano";
        contaDoFulano.deposita(250.00);
        System.out.println("Saldo da conta do Fulano: " + contaDoFulano.saldo);

        Conta contaDoBeltrano = new Conta();
        contaDoBeltrano.titular = "Beltrano";
        contaDoBeltrano.deposita(1250.00);
        System.out.println("Saldo da conta do Beltrano: " + contaDoBeltrano.saldo);

        System.out.println();
        System.out.println("Transferencia da conta " + contaDoFulano.titular + " para conta " + contaDoBeltrano.titular);

        if (contaDoFulano.transfere(249.50, contaDoBeltrano))
            System.out.println("Transferencia realizada com sucesso!");
        else
            System.out.println("Saldo insuficiente!");

        System.out.println("Saldo da conta do Fulano: " + contaDoFulano.saldo);
        System.out.println("Saldo da conta do Beltrano: " + contaDoBeltrano.saldo);

    }
}