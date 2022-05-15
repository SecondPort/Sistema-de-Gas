package edu.ubp.doo.model;

public class Cliente extends Persona {
    private Persona persona;
    private Pedido pedido;
    private String razonSocial;
    private String direccion;

    public Cliente(String nombre, String apellido, String telefono) {
        super();
    }

    public String getRazonSocial(){
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

}
