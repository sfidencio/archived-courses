public class Main {
    public static void main(String[] args) {

        Cliente fulano = new Cliente();
        fulano.setNome("Fulano");
        fulano.setCpf("123456789421");
        fulano.setProfissao("Analista de Sistemas");

        //Manter estado consistente do objeto, não deixarei criar conta sem inicializar os atributos obrigatorios.
        Conta contaDoFulano = new Conta(fulano, 1125, 99998588);

        //Objeto é imutavel quando recebe um valor e não modifica mais..ate sua destruição.

//            contaDoFulano.setTitular(fulano);
//            contaDoFulano.setNumero(12349985);
//            contaDoFulano.setAgencia(2879);
        //contaDoFulano
        contaDoFulano.deposita(200);
        System.out.println("Saldo da conta do " + contaDoFulano.getTitular().getNome() + ": " + contaDoFulano.getSaldo());
        System.out.println("Dados da Conta: " + contaDoFulano);


        Conta contaDoCiclano = new Conta(new Cliente("Ciclano","123456789","Policial"),4744,99987);
        System.out.println("Dados da Conta: " + contaDoCiclano);
        Conta contaDoBeltrano = new Conta(new Cliente("Beltrano","99855588","Zelador"),4478,22258);
        System.out.println("Dados da Conta: " + contaDoBeltrano);



        System.out.println("Total de Contas: " + Conta.getTotal());

    }
}