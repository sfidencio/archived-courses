package br.com.sfidencio.service.implementation;

public class CalculadoraService  {
    public double somarListaNumeros(double[] numeros) {
        double total = 0d;
        if (numeros.length <= 0)
            throw new IllegalArgumentException("Nenhum numero a ser somando foi passado por parametro!");

        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        return total;
    }
}
