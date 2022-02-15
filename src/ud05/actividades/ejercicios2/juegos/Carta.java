package ud05.actividades.ejercicios2.juegos;

import java.util.Scanner;

/*
 * Representa una carta de poker
 */
public class Carta {
    private int numero;
    private char palo;

    public Carta() {
        numero=1;
        palo='p';
    }

    public Carta (Carta carta){
        numero=carta.getNumero();
        palo=carta.getPalo();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        Scanner sc = new Scanner(System.in);

        // validar que esté entre 1 y 13
        numero = sc.nextInt();

    }

    public char getPalo() {
        return palo;
    }

    public void setPalo() {
        Scanner sc = new Scanner(System.in);

        // validar que sea c(corazón), p (pikas), r (rombo), t(trébol)
        palo = sc.next().charAt(0);
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo=" + palo +
                '}';
    }

    public void mostrarCarta(){
        String unPalo="";
        switch (palo){
            case 'c': unPalo = "Corazón" ; break;
            case 'p': unPalo = "Pikas"; break;
            case 't': unPalo = "Trébol"; break;
            case 'r': unPalo = "Rombo"; break;
        }
        String unNumero=""+numero;
        switch (numero){
            case 1: unNumero = "As"; break;
            case 11: unNumero = "Jack"; break;
            case 12: unNumero = "Queen"; break;
            case 13: unNumero = "King"; break;
        }
        System.out.println("Es el número " + unNumero + " de palo " + unPalo);
    }

    private int comparar(Carta carta){
        if (this.numero > carta.getNumero())
            return -1;
        else if (this.numero < carta.getNumero())
            return 1;
        else
        if (this.palo==carta.getPalo())
            return 0;
        else if (this.palo=='t')
            return -1;
        else if (this.palo=='r' && carta.getPalo()!='t')
            return -1;
        else if (this.palo=='p' && carta.getPalo()!='t' && carta.getPalo()!='r')
            return -1;
        else
            return 1;
    }

    public void mostrarGanadora(Carta carta){
        int ganadora = comparar(carta);
        if (ganadora==0)
            System.out.println("Empate");
        else if (ganadora ==-1) {
            System.out.println("La ganadora es: ");
            this.mostrarCarta();
        }
        else{
            System.out.println("La ganadora es: ");
            carta.mostrarCarta();
        }
    }
    public static void main(String[] args) {
        Carta c1 = new Carta();
        Carta c2 = new Carta(c1);

        //System.out.println(c1);
        //System.out.println(c2);

        c1.mostrarCarta();
        c2.setNumero();
        c2.setPalo();
        c2.mostrarCarta();

        c1.mostrarGanadora(c2);
    }
}