package ud05.actividades.Recuperacion1.JuegoPiratas;

public class PiratasCaribe {
    public static void main(String[] args) {
        Isla i1 = new Isla( new Posicion(100,100), 50,"Aruba");
        Isla i2 = new Isla( new Posicion(300,300), 50,"Margarita");
        Isla i3 = new Isla( new Posicion(400,400), 50,"San Martin");

        Barco b1 = new Barco("Royal Fortune", new Posicion(0,0), "Jean David Nau Hook", 20);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(b1);

    }
}
