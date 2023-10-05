package org.example;

import java.util.Date;

public class Usuario {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String correo;
    private String contraseña;
    private String foto; // Nombre del archivo de la foto (opcional)

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con todos los atributos
    public Usuario(String nombre, String apellido, Date fechaNacimiento, String correo, String contraseña, String foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.contraseña = contraseña;
        this.foto = foto;
    }

    // Métodos getters y setters

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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}