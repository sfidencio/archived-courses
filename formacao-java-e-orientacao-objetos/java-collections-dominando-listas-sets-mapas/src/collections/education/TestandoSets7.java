package collections.education;

import java.io.IOException;

public class TestandoSets7 {
    public static void main(String[] args) throws IOException {
        Curso curso = new Curso("Fulano", new Instrutor("Beltrano", 65));
        Aluno a1 = new Aluno("Fulano", 25000);
        Aluno a2 = new Aluno("Fulano", 25001);
        Aluno a3 = new Aluno("Fulano", 25003);
        Aluno a4 = new Aluno("Jorge", 25004);
        Aluno a5 = new Aluno("Caio", 25005);
        curso.matricular(a1);
        curso.matricular(a2);
        curso.matricular(a3);
        curso.matricular(a5);

        curso.getAlunos().forEach(item -> {
            System.out.println(item);
        });


        //Checar se aluno matriculado
        System.out.println("Aluno : " + a1.getNome() + " esta matriculado? => " + (curso.isMatriculado(a1) ? "Sim" : "Não"));
        System.out.println("Aluno : " + a2.getNome() + " esta matriculado? => " + (curso.isMatriculado(a2) ? "Sim" : "Não"));
        System.out.println("Aluno : " + a3.getNome() + " esta matriculado? => " + (curso.isMatriculado(a3) ? "Sim" : "Não"));
        System.out.println("Aluno : " + a4.getNome() + " esta matriculado? => " + (curso.isMatriculado(a4) ? "Sim" : "Não"));

    }

}
