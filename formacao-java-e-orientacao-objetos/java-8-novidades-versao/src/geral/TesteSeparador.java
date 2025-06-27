package geral;

public class TesteSeparador {
    public static void main(String[] args) {
        String valor1 = "PROD1#PROD2";
        String valor2 = "PROD1#PROD2#";
        String valor3 = "#";


        String[] valor1Quebrado = valor1.split("#");

        for (int i = 0; i < valor1Quebrado.length; i++) {
            System.out.println("Valor : " + valor1Quebrado[i]);
        }

        System.out.println();


            if(!valor3.startsWith("#"))
                throw  new IllegalArgumentException("Nao inicia com hashtag!");


        String[] valor3Quebrado = valor3.split("#");

        for (int i = 0; i < valor3Quebrado.length; i++) {
            System.out.println("Valor : " + valor3Quebrado[i]);
        }
        System.out.println(valor3Quebrado.length);

        if(valor3Quebrado.length ==0)
            throw  new IllegalArgumentException("nenhum elemento no array.");


    }
}
