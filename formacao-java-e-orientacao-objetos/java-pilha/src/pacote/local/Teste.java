package pacote.local;

public class Teste {
    public static void main(String[] args) {
        //System.out.println(Teste.class.getName());
        //System.out.println(Teste.class.getSimpleName());

        Conta conta = new Conta();
        try {
            conta.depositar(0); //Vai jogar um exception checked, nao obriga tratar ou jogar, pois herda de Exception
        } catch (ValorIncorretoException e) {
            //throw new RuntimeException(e);
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(2000); //Vai jogar uma exception unchecked pois herda de RuntimException
        } catch (SaldoInsuficienteRuntimeException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
