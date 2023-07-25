package models;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario {

    private int id;
    private String nombre;
    private String contrasenia;
    private TipoUsuario tipo;


    public Usuario() {

    }

    public Usuario(int id, String nombre, String contrasenia, TipoUsuario tipo) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }

    public Usuario(String nombre, String contrasenia, TipoUsuario tipo) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}