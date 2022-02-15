package ud05.actividades.documentacion;

/**
 * Representa un tesoro en una posicion especifica
 *
 */
public class Tesoro {
    private  int monedas;
    private String mensaje;
    private Posicion pos;
    private boolean robado;
    private int id;

    public Tesoro(int monedas, Posicion pos, int id) {
        this.monedas = monedas;
        this.pos = pos;
        this.id = id;
        this.robado=false;
        this.mensaje=Cipher.encode("hola",3);

    }

}
