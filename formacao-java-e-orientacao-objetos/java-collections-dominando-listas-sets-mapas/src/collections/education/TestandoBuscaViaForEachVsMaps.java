package collections.education;

import java.util.Objects;

public class TestandoBuscaViaForEachVsMaps {
    public static void main(String[] args) {
        Curso curso = new Curso("Java Colecoes", new Instrutor("Fulano", 43));
        curso.adicionar(new Aula("01-Entendendo a API de colecoes.", 120));
        curso.adicionar(new Aula("02-Entendendo a API de colecoes.", 121));
        curso.adicionar(new Aula("03-Entendendo a API de colecoes.", 122));
        curso.adicionar(new Aula("04-Entendendo a API de colecoes.", 123));
        curso.adicionar(new Aula("05-Entendendo a API de colecoes.", 124));
        curso.adicionar(new Aula("06-Entendendo a API de colecoes.", 125));
        curso.adicionar(new Aula("07-Entendendo a API de colecoes.", 126));

        Aluno aluno = null;
        for (int i = 0; i < 400000; i++) {
            aluno = new Aluno("Fulano" + (i + 1), (i + 1));
            curso.matricular(aluno);
        }

        //System.out.println(curso);

        System.out.println();
        //Verificando se aluno matriculado
        System.out.println("Aluno Fulano 101 esta matriculado?=>" + curso.isMatriculado(new Aluno("Fulano1", 101)));
        System.out.println("Aluno Fulano 100 esta matriculado?=>" + curso.isMatriculado(new Aluno("Fulano1", 100)));
        System.out.println("Aluno Fulano 99 esta matriculado?=>" + curso.isMatriculado(new Aluno("Fulano1", 99)));

        System.out.println();
        System.out.println();
        //Obtendo registro
        /*try {
            Aluno alunoEncontrado = curso.obterAlunoMatriculado(100);
            System.out.println("Aluno encontrado: " + alunoEncontrado);
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }*/


        //Obtendo registro
        try {
            Aluno alunoEncontrado = curso.obterAlunoMatriculado(150000);
            System.out.println("Aluno encontrado na Lista: " + alunoEncontrado);
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }


        try {
            //Utilizando maps para busca
            long ti = System.currentTimeMillis();
            Aluno alunoEncontradoMap = curso.obterAlunoMatriculadoV2(401000);
            System.out.println("Aluno encontrado no Map: " + (Objects.isNull(alunoEncontradoMap) ? "Aluno nao encontrado!" : "Aluno Encontrado: " + alunoEncontradoMap));
            long tf = System.currentTimeMillis();
            System.out.println("Tempo total(Map): " + (tf - ti));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        try {
            //Utilizando maps para busca
            long ti1 = System.currentTimeMillis();
            Aluno alunoEncontradoMap1 = curso.obterAlunoMatriculadoV2(399000);
            System.out.println("Aluno encontrado no Map: " + (Objects.isNull(alunoEncontradoMap1) ? "Aluno nao encontrado!" : "Aluno Encontrado: " + alunoEncontradoMap1));
            long tf1 = System.currentTimeMillis();
            System.out.println("Tempo total(Map): " + (tf1 - ti1));
        } catch (Exception ex) {
            System.out.println();
            System.out.println(ex.getMessage());
        }


    }
}
