package collections.education;

public class TestandoListas6 {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Conhecendo o Frameworks", 20);
        Aula aula2 = new Aula("Entendendo como funciona DI(Injecao de Dependencia)", 15);
        Aula aula3 = new Aula("Arquivos de configuracoes", 60);

        Curso curso = new Curso("Formacao SpringFramework", new Instrutor("Joao Canabrava",18));

        //Exception in thread "main" java.lang.UnsupportedOperationException
        //Pois retorna uma lista somente leitura -  Collections.unmodifiableList
        curso.getAulas().add(aula1);
        curso.getAulas().add(aula2);
        curso.getAulas().add(aula3);

        System.out.println(curso);


    }
}
