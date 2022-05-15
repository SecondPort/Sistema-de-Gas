package edu.ubp.doo.model;

import java.util.ArrayList;

public class Pedido{
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private String fecha;
    private Double total;
    public Pedido(Cliente cliente,ArrayList<Producto> productos,String fecha,Double total){
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.total = total;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    public void setProductos(ArrayList<Producto> productos){
        this.productos = productos;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public Double getTotal(){
        return total;
    }
    public void setTotal(Double total){
        this.total = total;
    }
}
