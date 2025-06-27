public class CalculoMatematico {

    public static int calcularFatorialLacoRepeticaoFor(int numero) {
        //interativo
        int resultado = 1; //atencao
        for (int i = 1; i <= numero; i++)
            resultado *= i;
        return resultado;
    }

    public static int calcularFatorialLacoRepeticaoWhile(int numero) {
        //interativo
        int resultado = numero;
        if (numero == 0)
            resultado++;
        while (numero > 1)
            resultado *= --numero;
        return resultado;
    }

    public static int calcularFatorialRecursivo(int numero) {
        return numero == 0 ? 1 : numero * calcularFatorialRecursivo(numero - 1);
    }


}
