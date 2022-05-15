package edu.ubp.doo.model;

public class Persona{
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona() {
    }

    public void Cliente(String tipoDocumento,String numeroDocumento,String nombre,String apellido,String razonSocial,String direccion,String barrio,String zona,String telefono){
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public String getTipoDocumento(){
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumeroDocumento(){
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento){
        this.numeroDocumento = numeroDocumento;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
