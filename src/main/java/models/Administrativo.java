package models;

public class Administrativo extends Usuario {

    private String area;

    private int expPrevia;

    public Administrativo() {

    }

    public Administrativo(int id, String nombre, String contrasenia, TipoUsuario tipo, String area, int expPrevia) {
        super(id, nombre, contrasenia, tipo);
        this.area = area;
        this.expPrevia = expPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getExpPrevia() {
        return expPrevia;
    }

    public void setExpPrevia(int expPrevia) {
        this.expPrevia = expPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", expPrevia=" + expPrevia +
                '}';
    }
}