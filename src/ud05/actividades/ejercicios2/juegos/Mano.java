package ud05.actividades.ejercicios2.juegos;

/**
 * Representa una mano de un juego de 3 cartas
 */
public class Mano {
    private int tamanio;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;

    public Mano() {
        tamanio=3;
        carta1 = new Carta();
        carta2 = new Carta();
        carta3 = new Carta();
    }

    public int getTamanio(){
        return tamanio;
    }

    public void mostrarCarta(int i){
        if (i==1)
            carta1.mostrarCarta();
        else if (i==2)
            carta2.mostrarCarta();
        else if (i==3)
            carta3.mostrarCarta();
        else
            System.out.println("Vete a la porra...");
    }

    public void setCarta(int i){
        if (i==1){
            carta1.setPalo();
            carta1.setNumero();
        } else if (i==2){
            carta2.setPalo();
            carta2.setNumero();
        } else if (i==3) {
            carta3.setPalo();
            carta3.setNumero();
        } else
            System.out.println("Vete a la porra...");
    }

    public void pedirMano(){
        for(int i=1; i<=tamanio; i++){
            setCarta(i);
        }
    }

    public Carta getCarta1() {
        return carta1;
    }

    public void setCarta1(Carta carta1) {
        this.carta1 = carta1;
    }

    public Carta getCarta2() {
        return carta2;
    }

    public void setCarta2(Carta carta2) {
        this.carta2 = carta2;
    }

    public Carta getCarta3() {
        return carta3;
    }

    public void setCarta3(Carta carta3) {
        this.carta3 = carta3;
    }

    private int comparar (Mano mano){
        int sumaOtraMano = mano.getCarta1().getNumero()+mano.getCarta2().getNumero()+mano.getCarta3().getNumero();
        int sumaEstaMano = this.carta1.getNumero()+this.carta2.getNumero()+this.carta3.getNumero();
        if (sumaEstaMano>sumaOtraMano) {
            return -1;
        } else if (sumaEstaMano<sumaOtraMano){
            return 1;
        } else {
            int rojasOtraMano=0;
            int rojasEstaMano=0;
            if (mano.getCarta2().getPalo()=='c' || mano.getCarta1().getPalo()=='r')
                rojasOtraMano++;
            if (this.getCarta2().getPalo()=='c' || this.getCarta1().getPalo()=='r')
                rojasEstaMano++;

            if (rojasEstaMano>rojasOtraMano) {
                return -1;
            } else if (rojasEstaMano<rojasOtraMano){
                return 1;
            } else {
                return 0;
            }
        }

    }
    public void manoGanadora(Mano mano){
        int ganadora = comparar(mano);
        if (ganadora==-1) {
            System.out.println("Ganadora");
            System.out.println(this);
        } else if (ganadora ==1){
            System.out.println("Ganadora");
            System.out.println(mano);
        } else{
            System.out.println("Empate");
            System.out.println(this);
            System.out.println(mano);
        }
    }

    @Override
    public String toString() {
        return "Mano{" +
                ", carta1=" + carta1 +
                ", carta2=" + carta2 +
                ", carta3=" + carta3 +
                '}';
    }

    public static void main(String[] args) {
        Mano mano1 = new Mano();
        Mano mano2 = new Mano();

        System.out.println(mano1);
        System.out.println(mano1);

        mano1.pedirMano();
        mano2.pedirMano();

        System.out.println(mano1);
        System.out.println(mano2);

        mano1.manoGanadora(mano2);
    }
}