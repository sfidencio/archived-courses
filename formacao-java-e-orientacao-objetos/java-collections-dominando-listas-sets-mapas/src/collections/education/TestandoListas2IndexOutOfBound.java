package collections.education;

import java.util.ArrayList;

public class TestandoListas2IndexOutOfBound {
    public static void main(String[] args) {
        String curso1 = "curso.Curso de Java Orientado a Objetos";
        String curso2 = "Dominando Spring Framework com SpringBoot";
        String curso3 = "JPA no bolso!";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        for (int i = 0; i <= cursos.size(); i++) {
            System.out.println(cursos.get(i));
        }
        /*
         * O método size retorna o total de elementos. Como estamos acessando até i <= cursos.size()
         * temos um problema: Uma exception do tipo IndexOutOfBoundsException é lançada!
         *
         */
    }
}
