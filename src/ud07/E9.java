package ud07;



import java.util.*;


public class  E9 {
    public static void main(String[] args) {
        Random rd = new Random();
        List<Integer> vector = new Vector();
             int nPremiado = rd.nextInt(20)+1;
        for (int i=0; i<100; i++)
            vector.add(rd.nextInt(20)+1);

        Iterator iterador = vector.iterator();
        for (int i= 1; iterador.hasNext(); i++){
            int nActual = (int) iterador.next();
            if(nActual == nPremiado)
                System.out.printf("    \033[2;32m%02d", nActual);
            else
                System.out.printf("    \033[0;30m%02d", nActual);
            if (i%10==0)
                System.out.println();
        }
    }
}