import org.junit.Assert;

class CalculoMatematicoTest {

    @org.junit.jupiter.api.Test
    void calcularFatorialLacoRepeticaoFor() {
        int numeroTestado = 3;
        int retornoEsperado = 6;
        int resultado = CalculoMatematico.calcularFatorialLacoRepeticaoFor(numeroTestado);
        Assert.assertEquals(retornoEsperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularFatorialLacoRepeticaoWhile() {
        int numeroTestado = 3;
        int retornoEsperado = 6;
        int resultado = CalculoMatematico.calcularFatorialLacoRepeticaoWhile(numeroTestado);
        Assert.assertEquals(retornoEsperado, resultado);
    }

    @org.junit.jupiter.api.Test
    void calcularFatorialRecursivo() {
        int numeroTestado = 5;
        int retornoEsperado = 120;
        int resultado = CalculoMatematico.calcularFatorialRecursivo(numeroTestado);
        Assert.assertEquals(retornoEsperado, resultado);
    }
}