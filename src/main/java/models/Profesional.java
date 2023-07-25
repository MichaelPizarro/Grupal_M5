package models;

public class Profesional extends Usuario{

    private String titulo;

    private String fechaIngreso;

    public Profesional() {

    }

    public Profesional(int id, String nombre, String contrasenia, TipoUsuario tipo, String titulo, String fechaIngreso) {
        super(id, nombre, contrasenia, tipo);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
}