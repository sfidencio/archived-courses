package br.com.sfidencio.curso.teste.automatizados;

public class CalculadoraTestes {
    public static void main(String[] args) {
        double soma = new Calculadora().somar(3, 3);
        System.out.println(soma);
         soma = new Calculadora().somar(3, 4.3d);
        System.out.println(soma);
    }
}
