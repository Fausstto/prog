package ud05.actividades.Recuperacion1.JuegoPiratas;

import javax.swing.plaf.basic.BasicTreeUI;

public class Barco {
    private String nombre;
    private Posicion posicionActual;
    private String Capitan;
    private int tripulacion;
    private int recaudacion;

    public Barco(String nombre, Posicion posicionActual, String capitan, int tripulacion) {
        this.nombre = nombre;
        this.posicionActual = posicionActual;
        Capitan = capitan;
        this.tripulacion = tripulacion;
        recaudacion = 0;
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }
    public String getAliasCapitan(){
        String alias = Capitan.substring(0, Capitan.indexOf(" "));
        return alias;
    }

    @Override
    public String toString() {
        return "Barco{" + nombre +
                "\nen posicion : " + posicionActual +
                ", tripulantes :" + tripulacion + " tripulantes" +
                ", Capitan :" + Capitan + "\n" +
                "recaudacion :" + recaudacion +
                '}';
    }

    public String navegar( Isla isla){
        posicionActual = new Posicion(PosGenerator.nextOutside(isla.getCentro(), isla.getRadio()));
        isla.obtenerTesoro(posicionActual);
        recaudacion = recaudacion = isla.obtenerTesoro(posicionActual).getMonedas();
        String mensaje = isla.obtenerTesoro(posicionActual).getMensaje();
        return "Navegando por la isla" + isla.getNombre() + "\nMensaje del tesoro cifrado : "+ mensaje;
    }

    public static void main(String[] args) {
        Barco b1 = new Barco("Royal fortune", new Posicion(0,0), "Jean Carlos",15);
        System.out.println(b1);
    }
}
