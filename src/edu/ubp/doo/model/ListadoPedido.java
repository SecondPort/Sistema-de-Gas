package edu.ubp.doo.model;

import java.util.ArrayList;

public class ListadoPedido{
    private ArrayList<Pedido> pedidos;
    public ListadoPedido(ArrayList<Pedido> pedidos){
        this.pedidos = pedidos;
    }
    public ArrayList<Pedido> getPedidos(){
        return pedidos;
    }
    public void setPedidos(ArrayList<Pedido> pedidos){
        this.pedidos = pedidos;
    }
}
