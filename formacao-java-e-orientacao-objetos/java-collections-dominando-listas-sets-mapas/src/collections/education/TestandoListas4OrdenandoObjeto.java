package collections.education;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas4OrdenandoObjeto {
    public static void main(String[] args) {
        List<Pedido> depositoPedidos = new ArrayList<Pedido>();
        Pedido pedido = new Pedido(10030,new Cliente("88888888888","Fulano de Tal"));
        pedido.adicionarItemPedido(new ItemPedido(new Produto("Feijao", 2.20, 160)));
        pedido.adicionarItemPedido(new ItemPedido(new Produto("Carne", 4.20, 200)));

        //System.out.println(pedido);

        Pedido pedido2 = new Pedido(10020,new Cliente("99999999999","Beltrano de Tal"));
        pedido2.adicionarItemPedido(new ItemPedido(new Produto("Macarrao", 9.20, 789)));
        pedido2.adicionarItemPedido(new ItemPedido(new Produto("Extrato Tomate", 4.20, 142)));

        //System.out.println(pedido2);
        //Ordenando pela descricao do produto

        depositoPedidos.add(pedido);
        depositoPedidos.add(pedido2);


        System.out.println("Antes de ordenar: ");
        System.out.println(depositoPedidos);
        System.out.println();
        System.out.println();
        Collections.sort(depositoPedidos);
        System.out.println("Depois de ordenar: ");
        System.out.println(depositoPedidos);



    }
}
