import pacote.local.Conta;

public class MainExcecoes8 {
    public static void main(String[] args) {
        System.out.println("Inicio Man()");
        try {
            Conta conta = new Conta();
            conta.depositar(20);
            conta.sacar(21);
            System.out.println(conta.getSaldo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Fim Man()");
    }


}