package ud05.actividades.Recuperacion1.JuegoPiratas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PosGenerator {
    public static  Posicion nextInside(Posicion centro, double radio){
        Random rd = new Random();
        Posicion aleatoria;
        do{
            aleatoria = new Posicion((double)(rd.nextInt(999)+1),(double)(rd.nextInt(999)+1));
        }while(radio<centro.distancia(aleatoria));
        return  aleatoria;
    }
    public static  Posicion nextOutside(Posicion centro, double radio){
        Posicion aleatoria;
        double infX= centro.getCoordenadaX()- radio;
        double supX= centro.getCoordenadaX()+(radio+1);
        double infY= centro.getCoordenadaY() - radio;
        double subY= centro.getCoordenadaY()+(radio+1);

        do{
            double x= ThreadLocalRandom.current().nextDouble(infX,supX);
            double y= ThreadLocalRandom.current().nextDouble(infY,subY);
            aleatoria = new Posicion(x,y);
        }while(radio<centro.distancia(aleatoria));

        return  aleatoria;
    }


}
