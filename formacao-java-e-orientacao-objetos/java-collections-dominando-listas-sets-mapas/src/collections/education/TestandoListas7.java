package collections.education;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestandoListas7 {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Conhecendo o Frameworks", 20);
        Aula aula2 = new Aula("Entendendo como funciona DI(Injecao de Dependencia)", 15);
        Aula aula3 = new Aula("Arquivos de configuracoes", 63);

        Curso curso = new Curso("Formacao SpringFramework", new Instrutor("Joao Canabrava",25));

        //Exception in thread "main" java.lang.UnsupportedOperationException
        //Pois retorna uma lista somente leitura -  Collections.unmodifiableList
        //curso.getAulas().add(aula1);
        //curso.getAulas().add(aula2);
        //curso.getAulas().add(aula3);

        curso.adicionar(aula1);
        curso.adicionar(aula2);
        curso.adicionar(aula3);
        //curso.adicionar(null);

        System.out.println(curso.getAulas());
        System.out.println();
        System.out.println("Calculando tempo total das aulas usando foreach: " + curso.calcularTempo());


        //Vamos tentar ordenar a lista read-only
        //Exception in thread "main" java.lang.UnsupportedOperationException
        /*curso.getAulas().sort(new Comparator<curso.Aula>() {
            @Override
            public int compare(curso.Aula o1, curso.Aula o2) {
                return Integer.valueOf(o1.getTempo()).compareTo(Integer.valueOf(o2.getTempo()));
            }
        });*/

        //curso.getAulas().sort(Comparator.comparing(item-> Integer.valueOf(item.getTempo())));
        //curso.getAulas().sort(((o1, o2) -> ((Integer)o1.getTempo()).compareTo(((Integer)o2.getTempo()))));

        List<Aula> listaAulasModificaveis = new ArrayList<>(curso.getAulas());
        listaAulasModificaveis.sort(Comparator.comparing(item -> Integer.valueOf(item.getTempo())));


        int tempoTotal = listaAulasModificaveis.stream().mapToInt(Aula::getTempo).sum();
        System.out.println("Calculando tempo total usando map: " + tempoTotal);

        List<Aula> aulas = listaAulasModificaveis.stream().filter(item -> item.getTempo() > 5).collect(Collectors.toList());
        System.out.println(aulas);

        List<Integer> numeros = new ArrayList<>(0);
        for (int i = 1; i <= 100; i++)
            numeros.add(i);

        System.out.println(numeros);
        System.out.println();
        System.out.println();

        //Filtrando elementos...
        List<Integer> listaFiltrada = numeros.stream().filter(item -> item > 10 && item < 23).collect(Collectors.toList());
        System.out.println(listaFiltrada);

        //Obter valor maximo
        int valorMinimo = numeros.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(valorMinimo);

    }
}
