package edu.ubp.doo.model;

public class Distribuidor{
    private Empleado empleado;
    private Zona zona;
    public Distribuidor(String nombre,String apellido,String telefono,String zona){
        this.empleado = new Empleado(new Persona(),null,null);
        this.zona = new Zona(zona);
    }
}
