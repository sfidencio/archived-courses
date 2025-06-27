public class EstudoArraysPrimitivosLiteral {
    public static void main(String[] args) {
        String[] frutas = {"Maca", "Uva", "Pera", "Banana"}; //Literal, sem uso no 'new'
        System.out.println("Tamanho do vetor de frutas: " + frutas.length);
        System.out.println("Primeira posicao do vetor: " + frutas[0]);
        System.out.println("Segunda posicao do vetor: " + frutas[1]);
        System.out.println("Ultima posicao posicao do vetor: " + frutas[frutas.length - 1]);

        System.out.println();
        String[] carnes = new String[]{"Alcatra", "Cochao Mole", "Costela", "Picanha"};
        System.out.println("Ultima posicao posicao do vetor: " + carnes[carnes.length - 1]);
        System.out.println();

        //Loop
        for (int i = 0; i < carnes.length; i++)
            System.out.println(carnes[i]);

        System.out.println();
        //Vetor com numeros - nao permite tipos diferentes na mesma dimensão.
        int[] numerosPrimos = new int[]{1, 3, 5, 7};
        System.out.println("Numeros primos - ascendente");

        for (int i = 0; i < numerosPrimos.length; i++)
            System.out.println(numerosPrimos[i]);
        System.out.println("Numeros primos - descendente");

        for (int i = numerosPrimos.length - 1; i >= 0; i--)
            System.out.println(numerosPrimos[i]);
        //Provocando=>[ArrayIndexOfBoundException]

        int indice = 0;
        try {
            indice = 60;
            System.out.println(numerosPrimos[indice]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Índice: " + indice + " fora dos limites para comprimento: " + numerosPrimos.length);
        }
        System.out.println();
        System.out.println();
        //Criando numero loteria aleatorio.
        int[] numerosLoteria = new int[10]; //inicializa array vazio com x elementos a serem preenchidos.
        for (int i = 0; i < numerosLoteria.length; i++) {
            int valor =((int) (Math.random() * 100));
           if(valor<=60 || valor>0)
               numerosLoteria[i]=valor;
           else
               i--;
        }

        System.out.println("Numeros loteria: ");
        for (int i = 0; i < numerosLoteria.length ; i++) {
            System.out.println(numerosLoteria[i]);
        }

        /*String cpf = "1234567891";
        StringBuilder sb = new StringBuilder();
        sb.append("123456789");
        System.out.println(sb.reverse());*/



    }
}
