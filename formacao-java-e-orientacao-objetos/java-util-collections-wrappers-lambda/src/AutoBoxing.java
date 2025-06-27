import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoBoxing {
    public static void main(String[] args) {
        int idade = 30;
        List<Integer> idades = new ArrayList<>(0);
        idades.add(idade); //Autoboxing
        idades.addAll(Arrays.asList(Integer.parseInt("20"), Integer.parseInt("50"), Integer.parseInt("80")));
        idades.forEach(item -> {
            System.out.println(item);
        });


        //Autoboxing
        int j = 100;
        Integer j1 = Integer.valueOf(j);
        System.out.println("Valor convertido de primitivo para Objeto/Wrapper: " + j1);


        //Unboxing
        Integer j2 = Integer.valueOf(120);
        int j3 = j2.intValue();
        System.out.println("Valor convertido de objeto/Wrapper para primitivo: " + j3);

        String numero = "2";
        System.out.println("Tentar parsear numero string: " + Integer.parseInt(numero));

        String numeroNaoParseavel = "2';";
        try {
            System.out.println("Tentar parsear numero string: " + Integer.parseInt(numeroNaoParseavel));
        } catch (NumberFormatException ex) {
            System.out.println("Impossivel parsear numero: " + numeroNaoParseavel);
        }

        //Transformando
        float numeroFloat = j2.floatValue();
        System.out.println(numeroFloat);

        System.out.println("numero maximo integer: " + Integer.MAX_VALUE);
        System.out.println("numero minimo integer: " + Integer.MIN_VALUE);



        System.out.println("numero maximo double: " + Double.MAX_VALUE);
        System.out.println("numero minimo double: " + Double.MIN_VALUE);


        System.out.println("Tamanho integer: " + Integer.SIZE);
        System.out.println("Tamanho integer em bytes: " + Integer.BYTES);


        System.out.println("Tamanho double: " + Double.SIZE);
        System.out.println("Tamanho double em bytes: " + Double.BYTES);


        System.out.println("numero maximo float: " + Float.MAX_VALUE);
        System.out.println("numero minimo float: " + Float.MIN_VALUE);

        System.out.println("Tamanho float: " + Float.SIZE);
        System.out.println("Tamanho float em bytes: " + Float.BYTES);


        System.out.println("Tamanho Short: " + Short.SIZE);
        System.out.println("Tamanho Short em bytes: " + Short.BYTES);

        System.out.println("Tamanho byte: " + Byte.SIZE);
        System.out.println("Tamanho byte em bytes: " + Byte.BYTES);



        System.out.println("Tamanho long: " + Long.SIZE);
        System.out.println("Tamanho long em bytes: " + Long.BYTES);

        System.out.println("Tamanho char: " + Character.SIZE);
        System.out.println("Tamanho char em bytes: " + Character.BYTES);


        Integer numero4 =  Integer.valueOf("6");
        numero4++;
        System.out.println(numero4);



        //AutoBoxing e Unboxing double
        String valor1 = "3.2";
        Double valor2 = Double.valueOf(valor1);
        System.out.println("Double encaixotado[boxing]: " + valor2);
        System.out.println("Double desencaixotado[unboxing]: " + valor2.doubleValue());

        int x = valor2.compareTo(Double.valueOf(3.2));
        System.out.println(x);

        Number numeroRefLong = Long.valueOf(25);
        System.out.println(numeroRefLong);

        Number numeroRefDouble = Double.valueOf(3.4);
        System.out.println(numeroRefDouble);



        List<Number> numbers = new ArrayList<>(0);
        numbers.add(1);
        numbers.add(9.2);
        numbers.add(1.4f);
        for (Number number : numbers) {
            System.out.println("Type: " + number.getClass().getTypeName());
        }


    }
}
