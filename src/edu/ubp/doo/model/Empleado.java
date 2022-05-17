package edu.ubp.doo.model;

import java.util.ArrayList;

public class Empleado extends Persona {
    private final Persona persona;
    private String cargo;
    private Double salario;
    private ArrayList<Distribuidor> distribuidores;
    public Empleado(Persona persona,String cargo,Double salario){
        super();
        this.persona = persona;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
}
