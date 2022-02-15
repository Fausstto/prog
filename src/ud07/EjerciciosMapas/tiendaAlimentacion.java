package ud07.EjerciciosMapas;


import java.util.*;


public class tiendaAlimentacion {
    private Map<String, Productos> productos;

    public tiendaAlimentacion() {
        productos = new HashMap<>();
    }
    public void  cargaProductos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime  el codigo ");
        String codigo = sc.nextLine();
        System.out.println("Dime  el precio ");
        double precio = sc.nextDouble();

        sc.nextLine();

        System.out.println("Dime  el fecha ");
        String fecha = sc.nextLine();

        Productos p = new Productos(codigo, precio, fecha);
        productos.put(codigo, p);

    }
    public void modificarPrecioProducto(){
        System.out.println("Introduce el codigo de un producto, para modificar el precio");

    }
    public void mostrarPorductos(){
        productos.forEach((k,v)->{System.out.println(k +" -> "+ v );});
    }
    public void eliminarProductos(){

    }
    public static void main(String[] args) {
        tiendaAlimentacion p= new tiendaAlimentacion();
        int opcion = 0;
        switch (opcion){
            case 1:
                p.cargaProductos();
                break;
            case 2:
                p.modificarPrecioProducto();
                break;
            case 3:
                p.mostrarPorductos();
            case 4:
                p.eliminarProductos();
                break;
            case 5:
                System.out.println("Adios");
        }

    }
}
