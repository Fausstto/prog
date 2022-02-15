package ud05.actividades.Recuperacion1.JuegoPiratas;

public class Tesoro {
    private int identificador;
    private Posicion posicion;
    private  int monedas;
    private String mensaje;
    private boolean robado;

    public Tesoro(int identificador, Posicion posicion, int monedas ) {
        this.identificador = identificador;
        this.posicion = posicion;
        this.monedas = monedas;
        robado = false;
        mensaje =Cipher.encode("hola",3);
    }

    public int getIdentificador() {
        return identificador;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getMonedas() {
        return monedas;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean isRobado() {
        return robado;
    }

    @Override
    public String toString() {
        return "Tesoro {"+identificador+" en "+ posicion +" con " + monedas + "monedas";
    }
    public static void main(String[] args) {
        Tesoro t1 = new Tesoro(1,new Posicion(100,100),200);

        System.out.println(t1);
    }
}
