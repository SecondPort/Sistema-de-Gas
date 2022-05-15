package edu.ubp.doo.model;

import java.util.ArrayList;

public class Barrio{
    private String nombre;
    private Zona zona;
    private ArrayList<Direccion> direcciones;
    public Barrio(String nombre,String zona){
        this.nombre = nombre;
        this.zona = new Zona(zona);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
