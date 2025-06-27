public class Main {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.agencia = 1234;
        primeiraConta.numero = 98587;
        primeiraConta.titular = "Fulano de Tal";
        primeiraConta.saldo = 250.98;
        System.out.println("Histórico: " + primeiraConta);
        primeiraConta.saldo += 478.89;
        System.out.println("Histórico: " + primeiraConta);

        System.out.println();
        System.out.println();

        Conta segundaConta = new Conta();
        segundaConta.agencia = 3215;
        segundaConta.numero = 4525;
        segundaConta.titular = "Ciclano de Tal";
        segundaConta.saldo = 50.20;
        System.out.println("Histórico: " + segundaConta);
        segundaConta.saldo += 74;
        System.out.println("Histórico: " + segundaConta);


        Conta terceiraConta = new Conta();
        terceiraConta.saldo = 45.89;
        System.out.println("Histórico: " + terceiraConta);
        terceiraConta.saldo += 74;
        System.out.println("Histórico: " + terceiraConta);


        System.out.println();
        ContaPadrao contaPadrao1 = new ContaPadrao();
        contaPadrao1.saldo = 250;
        System.out.println("Saldo de conta padrao 1: " + contaPadrao1.saldo);
        System.out.println(contaPadrao1);


        System.out.println();
        ContaPadrao contaPadrao2 = new ContaPadrao();
        contaPadrao2.saldo = 450;
        System.out.println("Saldo de conta padrao 2: " + contaPadrao2.saldo);
        System.out.println(contaPadrao2);


        System.out.println();
        ContaPadrao contaPadrao3Ref = contaPadrao1;
        contaPadrao3Ref.saldo += 380;
        System.out.println("Saldo de conta padrao 3 Ref para conta padrao 1: " + contaPadrao3Ref.saldo);
        System.out.println(contaPadrao3Ref);

        System.out.println();
        System.out.println("Saldo atual da primeira conta: " + primeiraConta.saldo);
        System.out.println("Depositando para a conta : " + primeiraConta);
        double valorDeposito = 145.89;
        System.out.println("Depositando o valor: " + valorDeposito);
        primeiraConta.deposita(valorDeposito);
        System.out.println("Saldo atual da primeira conta: " + primeiraConta.saldo);

        System.out.println();
        System.out.println();
        System.out.println("Saldo atual da primeira conta: " + primeiraConta.saldo);
        double valorSaque = 250;
        boolean conseguiuSacar = primeiraConta.saca(valorSaque);
        System.out.println("Tentando fazer saque no valor de: " + valorSaque);
        if (conseguiuSacar)
            System.out.println("Saque realizado com sucesso!");
        else
            System.out.println("Saldo insuficiente!");

        System.out.println("Saldo atual da primeira conta: " + primeiraConta.saldo);


    }
}