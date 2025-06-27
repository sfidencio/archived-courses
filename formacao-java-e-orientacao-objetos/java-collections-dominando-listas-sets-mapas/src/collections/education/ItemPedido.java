package collections.education;

public class ItemPedido {
    private Produto produto;

    public ItemPedido(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "curso.ItemPedido{" + "\n" +
                "produto=" + produto + "\n" +
                '}';
    }
}
