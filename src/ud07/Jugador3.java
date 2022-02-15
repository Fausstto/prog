package ud07;

public class Jugador3 implements Comparable<Jugador3>{
    private String nombre;
    private int posicion;
    private int goles;

    public  static   final  int PORTERO=0;
    public  static   final  int DEFENSA=1;
    public  static   final  int CENTRO=2;
    public  static   final  int DELANTERO=3;

    private  String[] posiciones = {" Portero, ","Defensa" ," Centro ", "Delantero"};


    public Jugador3(String nombre, int posicion, int goles) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Jugador3{" +
                "nombre='" + nombre + '\'' +
                ", posicion=" + posiciones[posicion] +
                ", goles=" + goles +
                '}';
    }
    public int compareTo(Jugador3 otroJugador){

    }
}
