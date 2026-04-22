package collections.education;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestandoListas10 {
    public static void main(String[] args) {
        Curso cursoJPA = new Curso("curso.Curso de JPA", new Instrutor("Fulano de Tal", 55));
        cursoJPA.adicionar(new Aula("Entendendo como funciona o mapeamento objeto relacional", 40));
        cursoJPA.adicionar(new Aula("Aprofundando na especificacao JPA", 15));
        cursoJPA.adicionar(new Aula("Meu primeiro contato com JPA", 59));


        cursoJPA.matricular(new Aluno("Fulano", 1125));
        cursoJPA.matricular(new Aluno("Beltrano", 1124));
        cursoJPA.matricular(new Aluno("Ciclano", 1123));
        // cursoJPA.getAlunos().add(new Aluno("Josano",88888));

        //System.out.println(cursoJPA.getAlunos());
        cursoJPA.getAlunos().forEach(item ->{
            System.out.println(item.getNome() + " - " + item.getMatricula());
        });


        System.out.println(cursoJPA);


        System.out.println();
        System.out.println();
        //Obter lista a ser modificada
        List<Aula> aulasMutaveis = new ArrayList<>(cursoJPA.getAulas());
        System.out.println(aulasMutaveis);
        aulasMutaveis.sort(Comparator.reverseOrder());
        System.out.println(aulasMutaveis);


        System.out.println();
        //Calculando tempo utilizando java funcional
        System.out.println(cursoJPA.calcularTempoFeatureJava8());
        //Calculando tempo utilizando for tradicional
        System.out.println(cursoJPA.calcularTempo());

    }
}
