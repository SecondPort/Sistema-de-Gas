package edu.ubp.doo.model;

import java.util.ArrayList;

public class Zona{
    private String nombre;
    private ArrayList<Barrio> barrios;
    public Zona(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
