public class CalculadorImposto {
    public void executa(Tributavel conta, double baseCalculo) {
        System.out.println("Valor do tributo :" + conta.getValorImposto(baseCalculo));
    }
}
