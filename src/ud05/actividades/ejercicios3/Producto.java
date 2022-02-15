package ud05.actividades.ejercicios3;
/*
import java.util.Random;
import java.util.Scanner;

public class Producto {
    private String nombre;
    private int serie;
    private double  precio;

    public Producto(String nombre, double precio, String fecha) {
        this.nombre = nombre;
        this.precio = precio;
        serie = generar();
    }

    public Producto() {
        this("",0.0);
        serie = generar();
    }
    private int generar(){
        Random rd = new Random();
        int serie = rd.nextInt(1000)+1;

        return serie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSerie() {
        return serie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void pedirNombre(){
        Scanner sc = new Scanner(System.in);
        do{
            nombre = sc.nextLine();
        }while(nombre.length()>2);
    }
    public void pediNumero(){
        Scanner sc = new Scanner(System.in);
        do {
            precio = sc.nextDouble();
        }while(precio>0);
    }
    public void resumen(){
        System.out.println(" INFORME DE PRODUCTO ");
        System.out.println("---------------------");
        System.out.println(nombre);
        System.out.println(serie);
        System.out.println(precio);
    }
    public boolean iguales(Producto otro){
        boolean igualdad = false;


        if (this.nombre.equals(otro.getNombre()))
            igualdad = true;
        if (igualdad){
            if (this.serie == otro.getSerie())
                igualdad = true;
            else
                igualdad = false;
        }

        return igualdad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", serie=" + serie +
                ", precio=" + precio +
                '}';
    }

}
*/