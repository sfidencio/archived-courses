import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoListas {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.sort(new Compara(TipoComparacao.ASCENDENTE));
        for (Integer numero : numeros)
            System.out.println(numero);

        System.out.println("---------------------------------------------------------");
        //Comparar String
        List<String> nomesAsc = new ArrayList<>(0);
        nomesAsc.add("Fulano");
        nomesAsc.add("Beltrano");
        nomesAsc.add("Alano");
        nomesAsc.add("Ciclano");
        nomesAsc.add("Deltrano");
        nomesAsc.add("Heltrano");
        nomesAsc.add("Zeltrano");
        nomesAsc.add("Elano");
        nomesAsc.add("Geltrano");

        nomesAsc.sort(new ComparaStringAscendente());
        nomesAsc.forEach(item -> {
            System.out.println(item);
        });

        System.out.println("---------------------------------------------------------");

        List<String> nomesDesc = new ArrayList<>(0);
        nomesDesc.add("Fulano");
        nomesDesc.add("Beltrano");
        nomesDesc.add("Alano");
        nomesDesc.add("Ciclano");
        nomesDesc.add("Deltrano");
        nomesDesc.add("Heltrano");
        nomesDesc.add("Zeltrano");
        nomesDesc.add("Elano");
        nomesDesc.add("Geltrano");
        nomesDesc.sort(new ComparaStringDescendente());
        nomesDesc.forEach(item -> {
            System.out.println(item);
        });

    }
}

class Compara implements Comparator<Integer> {
    TipoComparacao tipoComparacao;

    Compara(TipoComparacao _tipoComparacao) {
        tipoComparacao = _tipoComparacao;
    }

    @Override
    public int compare(Integer o1, Integer o2) {

        if (tipoComparacao == TipoComparacao.ASCENDENTE) {
            if (o1 < o2)
                return 1;
            if (o1 > o2)
                return -1;

        } else {
            if (o1 > o2)
                return 1;
            if (o1 < o2)
                return -1;
        }

        return 0;
    }
}

enum TipoComparacao {
    ASCENDENTE, DESCENDENTE
}


class ComparaStringAscendente implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class ComparaStringDescendente implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}