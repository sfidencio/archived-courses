package collections.education;

import com.sun.source.doctree.SeeTree;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class TestandoSets8TabelaEspalhamentoEqualsHashCode {
    public static void main(String[] args) throws IOException {
        ProdutoConjunto p1 = new ProdutoConjunto(1l, "Arroz Cristal", new BigDecimal("20.00"), new BigDecimal("160.00"));
        ProdutoConjunto p2 = new ProdutoConjunto(2l, "Feijao Cristal", new BigDecimal("9.50"), new BigDecimal("220.00"));
        ProdutoConjunto p3 = new ProdutoConjunto(3l, "Macarrao Cristal", new BigDecimal("7.20"), new BigDecimal("480.00"));
        ProdutoConjunto p4 = new ProdutoConjunto(1l, "Arroz Cristal", new BigDecimal("20.00"), new BigDecimal("160.00"));
        //ProdutoConjunto p5 = new ProdutoConjunto(null, null, new BigDecimal("20.00"), new BigDecimal("160.00"));

        //Se implementarmos o hashcode e equals, e possivel manter registros unicos sem duplicidade,
        //E garantirmos comparações, em um Set<String> isso ja da certo, porque a classe String
        //Ja implementa o metodo equals e hashcode, ja na nossa classe não, ele pega padrao de Object
        //Sendo assim, necessario implementar

        Set<ProdutoConjunto> produtos = new HashSet<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        System.out.println(produtos.size());

        //Porem o objeto é o mesmo do p1, veja que o codigo e igual, utilizamos
        //Ele como parametro para garantir a unicidade
        ProdutoConjunto p1DesligadoDoConjunto = new ProdutoConjunto(1l, "Arroz Cristal", new BigDecimal("20.00"), new BigDecimal("160.00"));

        //Checando, se e igual, neste caso sera, pois o codigo do produto e igual ao que existe no Set<ProdutoConjunto>
        System.out.println("é igual: " + produtos.contains(p1DesligadoDoConjunto));

        System.out.println("é igual: " + (p1 == p1DesligadoDoConjunto));
        System.out.println("é igual: " + (p1.equals(p1DesligadoDoConjunto))); //Aqui vai da boa, pois implementamos o metodo equals para utilizar o codigo na comparacao
        System.out.println("é igual: " + (p1.equals(p2))); //Aqui vai da boa tambem, mas retorna false. pois implementamos o metodo equals para utilizar o codigo na comparacao
        System.out.println("hashcode: " + p1.hashCode());
        System.out.println("hashcode: " + p2.hashCode());
        System.out.println("hashcode: " + p1DesligadoDoConjunto.hashCode());

        /*
        * Se rodarmos o código novamente,
        * temos true em todos os testes.
        * Considere a seguinte regra: caso você sobrescreva o método equals,
        * obrigatoriamente deverá sobrescrever o método hashCode.
        */

        /*
         *Apesar de ser perigoso, se estamos verificando se um elemento pertence
         *a uma implementação de List, só precisamos reescrever o método equals(),
         * já que o método .contains() de List só utiliza o equals para comparação.
         *quando estamos usando o método .contains() de List ele utiliza apenas o .equals()
         * para comparar dois objetos, por isso a afirmativa é verdadeira.
         */

    }
}

class ProdutoConjunto {
    private Long codigo;
    private String descricao;
    private BigDecimal preco;
    private BigDecimal estoque;

    public ProdutoConjunto(Long codigo, String descricao, BigDecimal preco, BigDecimal estoque) {
        //04-Programando defensivamente
        if(codigo == null)
            throw  new NullPointerException("Codigo e necessario!");
        if(descricao == null)
            throw  new NullPointerException("Descricao e necessario!");
        if(preco == null)
            throw  new NullPointerException("Preco e necessario!");
        if(estoque == null)
            throw  new NullPointerException("Estoque e necessario!");

        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public BigDecimal getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
        return "ProdutoConjunto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }


    @Override
    public int hashCode() {

        return this.codigo.hashCode();
        // return this.nome.charAt(0);
        //return this.nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        ProdutoConjunto outroProduto = (ProdutoConjunto) obj;
        if (this.codigo == outroProduto.codigo)
            return true;
        return false;
    }


    //Oracle recomenda
   /*  @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numeroMatricula;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numeroMatricula != other.numeroMatricula)
            return false;
        return true;
    }*/
}

