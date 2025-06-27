package geral;

import java.util.Arrays;
import java.util.List;

public class TesteSeparador2 {
    public static void main(String[] args) {

        String renato = "Renato";
        String malerba = "Malerba";
        String dadoFormatado = String.format("Nome: %s%n, Sobrenome: %s",renato,malerba);
        System.out.println(dadoFormatado);
        String msg = String.format("[contas: %s, cartoes: %s, flagUpgrade: %s, vlrLimite: %s]",4,4,4,3);
        System.out.println(msg);
        System.out.println();
        System.out.println();





        String contaCartao = "#4532117139618483#4766085653042009#6504867260890306";
        String limite = "#11200#11200#";

        String sequencia = "#";
        String[] sequenciaArr = sequencia.split("#");

        System.out.println("Sequencia: " + sequenciaArr.length);


        List<String> contaCartaoList = Arrays.asList(contaCartao.split("#"));
        System.out.println(contaCartaoList);
        //contaCartaoList.removeIf(s->s.length() ==0);
        System.out.println(contaCartaoList);
        String[] contaCartaoArr = contaCartao.split("#");
        String[] limiteArr = limite.split("#");

        Boolean isIniciaHashTag = contaCartao.startsWith("#");
        Boolean isContemHashTag = contaCartao.contains("#");
        Boolean isTerminaHashTag = contaCartao.endsWith("#");

        System.out.println(isIniciaHashTag);
        System.out.println(isContemHashTag);
        System.out.println(isTerminaHashTag);



        System.out.println(contaCartaoArr.length);
        System.out.println(limiteArr.length);

    }
}
