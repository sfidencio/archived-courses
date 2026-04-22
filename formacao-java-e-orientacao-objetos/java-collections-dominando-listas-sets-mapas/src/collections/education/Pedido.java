package collections.education;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido implements Comparable<Pedido> {
    private int numero = 0;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int numero, Cliente cliente) {
        this.cliente = cliente;
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    //Devolve uma lista readOnly, nao deixa modifica-la diretametne pelo add
    //Preservamos pois o encapsulamento.
    //O curso.Cliente consumidor deste objeto, nao pode acessar diretamente o metodo add da lista
    public List<ItemPedido> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionarItemPedido(ItemPedido itemPedido) {
        this.itens.add(itemPedido);
    }

    @Override
    public String toString() {
        return "curso.Pedido{\n" +
                "numero=" + numero + "\n" +
                "cliente=" + cliente + "\n" +
                "itens=" + itens + "\n" +
                '}';
    }

    @Override
    public int compareTo(Pedido o) {
        return Integer.valueOf(this.getNumero()).compareTo(o.getNumero());
    }
}
