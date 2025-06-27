public class MainTesteReferencias {
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

        Conta segundaConta = primeiraConta;
        /*segundaConta.agencia = 3215;
        segundaConta.numero = 4525;
        segundaConta.titular = "Ciclano de Tal";
        segundaConta.saldo = 50.20;*/
        //System.out.println("Histórico: " + segundaConta);
        //segundaConta.saldo += 74;


        System.out.println("Como esta segunda conta agora?");
        System.out.println("Histórico: " + segundaConta);

        System.out.println();
        System.out.println("Como esta primeira conta agora?");

        System.out.println("Histórico: " + primeiraConta);

        System.out.println("Agora vou alterar o saldo da primeira conta, via segunda conta!");
        segundaConta.saldo = +1457.98;
        System.out.println("Historico primeira conta: " + primeiraConta);



        Conta terceiraConta = new Conta();
        terceiraConta.agencia = 4525;
        terceiraConta.numero = 7777898;
        terceiraConta.titular = "Beltrano de Tal";
        terceiraConta.saldo = 478.98;




        if (primeiraConta == segundaConta)
            System.out.println("São iguais!");
        else
            System.out.println("Não são iguais!");


        if (terceiraConta == segundaConta)
            System.out.println("São iguais! ");
        else
            System.out.println("Não são iguais!");

    }
}