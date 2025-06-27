public class IOF implements Tributavel {
    private final double ALIQUOTA = 0.03;

    @Override
    public double getValorImposto(double baseCalculo) {
        double resultadoCalculo = baseCalculo * ALIQUOTA;
        System.out.println("Calculando IOF: " + String.format("%.2f", resultadoCalculo));
        return resultadoCalculo;
    }
}
