package br.com.sfidencio.main;

import br.com.sfidencio.service.Calculadora;
import br.com.sfidencio.service.implementation.Multiplicar;
import br.com.sfidencio.service.implementation.Subtrair;

import java.util.Scanner;

public class CalcularPolimorfismo {
    /*
     *Observe que Calculadora é um interface, que estabelece um contrato, que expoe o metodo calcular.
     *Agora, cabe a classe que irá implementá-la, definir como será feito o calculo.
     */

    public static void main(String[] args) {
        //Multiplicaco
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadoraImpMult = new Multiplicar();
        System.out.println("Informe o primeiro numero a ser calculado: ");
        double n1 = scanner.nextDouble();
        System.out.println("Informe o segundo numero a ser calculado: ");
        double n2 = scanner.nextDouble();
        System.out.println("Resultado Multiplicacao: " + calculadoraImpMult.calcular(n1, n2));

        System.out.println("\n\nRealizando Subtracao agora: \n\n");
        Calculadora calculadoraImpSub = new Subtrair();
        //Subtracao
        System.out.println("Informe o primeiro numero a ser calculado: ");
        double n11 = scanner.nextDouble();
        System.out.println("Informe o segundo numero a ser calculado: ");
        double n21 = scanner.nextDouble();
        System.out.println("Resultado Subtração: " + calculadoraImpSub.calcular(n11, n21));

    }
}
