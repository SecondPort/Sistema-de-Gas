package edu.ubp.doo.model;

public class Factura{
    private Pedido pedido;
    private Empleado empleado;
    private Cliente cliente;
    private String fecha;
    private Double total;
    public Factura(Pedido pedido,Empleado empleado,Cliente cliente,String fecha,Double total){
        this.pedido = pedido;
        this.empleado = empleado;
        this.cliente = cliente;
        this.fecha = fecha;
        this.total = total;
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