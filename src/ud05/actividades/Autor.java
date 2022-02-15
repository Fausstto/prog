package ud05.actividades;

public class Autor {
    private String nombre;
    private String correo;
    private char genero;

    public Autor() {
        this("","",'m');
    }

    public Autor(String nombre, String correo, char genero) {
        this.nombre = nombre;
        this.correo = correo;
        this.genero = genero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", genero=" + genero +
                '}';
    }

}
