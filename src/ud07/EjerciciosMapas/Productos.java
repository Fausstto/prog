package ud07.EjerciciosMapas;

public class Productos {
    private String codigo;
    private double precio;
    private String fecha_caducidad;

    public Productos(String codigo, double precio, String fecha_caducidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }
}
