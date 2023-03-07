package com.eam_parcial.parcialuno.modelo;

public class Empleado {

    public String id;
    public String nombre;
    public String apellido;
    public String correo;
    public String direccion;
    public String telefono;

    public Empleado() {
    }

    public Empleado(String id, String nombre, String apellido, String correo, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getCorreo(){
     return correo;
    }
    
    public void setCorreo(String correo){
     this.correo = correo;
    }

    }
        
    







