package edu.ubp.doo.model;

public class DetalleFactura{
    private Factura factura;
    private Producto producto;
    private Integer cantidad;
    public DetalleFactura(Factura factura,Producto producto,Integer cantidad,Double precio){
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public Integer getCantidad(){
        return cantidad;
    }
    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }
}
