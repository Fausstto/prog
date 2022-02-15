package ud05.actividades.documentacion;

/**
 * Representa un punto en un plano de dos dimensiones
 */
public class Posicion {
    private double x;
    private double y;

    public Posicion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Posicion() {
        this(0,0);
    }
    public  Posicion(Posicion p){
        this(p.getX(),p.getY());
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distancia(Posicion p){
       return distancia(p.getX(),p.getY());
    }
    public double distancia(double x, double y){
        //parteX= Math.pow(x-this.x,2);
        double parteX=(x-this.x)*(x-this.x);
        double parteY=(y-this.y)*(y-this.y);
        double raiz= Math.sqrt(parteX+parteY);
        return raiz;
    }
}
