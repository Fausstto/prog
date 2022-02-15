package ud05.actividades.Recuperacion1.JuegoPiratas;

public class Posicion {
    private double coordenadaX = 0;
    private double coordenadaY = 0;

    public Posicion(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public Posicion() {
        this(0,0);
    }

    public Posicion (Posicion posicion){
        this (posicion.coordenadaX,posicion.coordenadaY);
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString() {
        return "Posicion (" + coordenadaX + coordenadaY + ')';
    }
    public double distancia(double x, double y){
        double px = Math.pow((x - coordenadaX),2);
        double py = Math.pow((y- coordenadaY),2);
        double distancia = Math.sqrt(px+py);
        return distancia;
    }
    public double distancia(Posicion p){
        return this.distancia(coordenadaX,coordenadaY);
    }
    public  int compararDistancia(Posicion p1,Posicion p2){
        int comparacion = 0;
        if(this.distancia(p1)<this.distancia(p2))
            comparacion = -1;
        else
            comparacion=1;
        return comparacion ;
    }
}
