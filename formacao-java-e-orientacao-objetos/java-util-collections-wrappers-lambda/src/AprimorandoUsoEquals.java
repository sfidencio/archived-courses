import br.com.github.sfidencio.model.Produto;

import java.math.BigDecimal;

public class AprimorandoUsoEquals {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setDescricao("Feijao");
        p1.setPreco(new BigDecimal("20.00"));

        Produto p2 = new Produto();
        p2.setCodigo(1);
        p2.setDescricao("Feijao");
        p2.setPreco(new BigDecimal("20.00"));


        System.out.println(p1.equals(p2));
    }
}
