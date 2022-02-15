package ud05.actividades.Recuperacion1.JuegoPiratas;

import java.util.Random;

public class Isla {
    private Posicion centro;
    private double radio;
    private String nombre;
    private Tesoro tesoro1;
    private  Tesoro tesoro2;
    private final  int maxMonedas = 500;
    private final   int minMonedas = 100;

    public Isla(Posicion centro, double radio, String nombre) {
        Random rd = new Random();
        this.centro = centro;
        this.radio = radio;
        this.nombre = nombre;

        tesoro1 = new Tesoro(1,PosGenerator.nextInside(centro,radio), (rd.nextInt(maxMonedas-minMonedas+1)+minMonedas ));
        tesoro2 = new Tesoro(2, PosGenerator.nextInside(centro,radio), (rd.nextInt(maxMonedas-minMonedas+1)+minMonedas));
    }

    public Posicion getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }

    public String getNombre() {
        return nombre;
    }
    public Tesoro obtenerTesoro(Posicion posicion){
        if(tesoro1.getPosicion().distancia(posicion)<=tesoro2.getPosicion().distancia(posicion))
            return tesoro1;
        else
            return tesoro2;
    }

    @Override
    public String toString() {
        return "Isla{" +nombre
                +", en " + centro +
                " con radio="+radio+", tiene :" +
                "\nTesoro{"+ tesoro1.getIdentificador() +
                " en " + tesoro1.getPosicion() + " con " +
                tesoro1.getMonedas()+ " monedas"+
                '}'+ "\nTesoro{"+ tesoro2.getIdentificador() +
                " en " + tesoro2.getPosicion() + " con " +
                tesoro2.getMonedas()+ " monedas"+
                '}';
    }

    public static void main(String[] args) {
        Isla isla1 = new Isla(new Posicion(300,300), 50, "Margarita");
        System.out.println(isla1);
    }
}
