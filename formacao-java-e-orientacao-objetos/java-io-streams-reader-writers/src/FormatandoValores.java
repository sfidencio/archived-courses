import java.text.NumberFormat;
import java.util.Locale;

public class FormatandoValores {
    public static void main(String[] args) {
        System.out.println();
        System.out.format("%s%n","Formatando String");
        System.out.format("%.2f%n",2.2580d);
        System.out.format("%.3f%n",2.2580d);

        int codigo = 100299;
        String descricao = "Feijao";
        Double preco = 1200.29d;

        //Formato BR
        String formato = String.format(new Locale("pt","BR"),"codigo: %d - descricao: %s - preco: %.2f ",codigo, descricao,preco);
       //formato americano
        String formato3 = String.format(Locale.US,"codigo: %d - descricao: %s - preco: %.2f ",codigo, descricao,preco);
        String formato4 = String.format(Locale.US,"codigo: %d - descricao: %s - preco: %10.2f ",codigo, descricao,preco);
        //String formato2 = String.format(codigo, descricao,preco);
        System.out.println(formato);
        System.out.println(formato3);
        System.out.println(formato4);
        //System.out.println(formato2);

        Locale.setDefault(new Locale("en","US"));
        String precoFormatoUS = NumberFormat.getCurrencyInstance().format(preco);
        System.out.println(precoFormatoUS);


        Locale.setDefault(new Locale("pt","BR"));
        String precoFormatoPtBR = NumberFormat.getCurrencyInstance().format(preco);
        System.out.println(precoFormatoPtBR);


    }
}
