package edu.ubp.doo.model;

public class CancelacionPedido{
    private Pedido pedido;
    private Empleado empleado;
    private String fecha;
    private String motivo;
    public CancelacionPedido(Pedido pedido,Empleado empleado,String fecha,String motivo){
        this.pedido = pedido;
        this.empleado = empleado;
        this.fecha = fecha;
        this.motivo = motivo;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public String getMotivo(){
        return motivo;
    }
    public void setMotivo(String motivo){
        this.motivo = motivo;
    }
}
