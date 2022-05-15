package edu.ubp.doo.model;

public class Direccion{
    private Barrio barrio;
    private String direccion;
    public Direccion(String zona,String barrio,String direccion){
        this.barrio = new Barrio(barrio,zona);
        this.direccion = direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}
