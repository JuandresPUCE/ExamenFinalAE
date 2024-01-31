package com.examen.puce.models;

//Se tiene una entidad Usuario con los siguientes atributos ID, nombre,  contraseña, perfil.
import jakarta.persistence.*;


@Entity
public class User {
    @Id
    private int id;
    private String nombre;
    private String contraseña;
    private String perfil;
    
    public User(int id, String nombre, String contraseña, String perfil) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.perfil = perfil;
    }

    public User() {
        super();
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
}
