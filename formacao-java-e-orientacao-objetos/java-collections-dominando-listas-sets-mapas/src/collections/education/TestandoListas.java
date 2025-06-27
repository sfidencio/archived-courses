package collections.education;

import java.util.ArrayList;

public class TestandoListas {
    public static void main(String[] args) {
        String curso1 = "curso.Curso de Java Orientado a Objetos";
        String curso2 = "Dominando Spring Framework com SpringBoot";
        String curso3 = "JPA no bolso!";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println(cursos); //Ele percorre a listas e executa imprime cada elemento e separando por virgula e envolvido no colchete, que simboliza uma lista.

        cursos.remove(1);//Remove segundo elemento pelo indice

        System.out.println(cursos);

        cursos.remove(curso1);//Remove pelo objeto

        System.out.println(cursos);

        System.out.println();
        System.out.println();
        ArrayList<String> cursos2 = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        //Acessando elemnto especifico
        String curso4 = cursos.get(0);//Acessando primeiro curso
        System.out.println(curso4);

        //Se tentar acessar um curso que nao existe, ou seja, o indice acessado esta fora dos limites (Bound)
        //String curso5 = cursos.get(1000); //Teremos java.lang.IndexOutOfBoundsException - Index 1000 out of bounds for length 4




    }
}
