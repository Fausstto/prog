package ud07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class E2 {
    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();
        List<Integer> numeros2 = new ArrayList<>();
        List<Integer> maximos = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            numeros.add(rd.nextInt(100) + 1);
            numeros2.add(rd.nextInt(100) + 1);

            if( numeros.get(i)>numeros2.get(i))
                maximos.add(numeros.get(i));
            else
                maximos.add(numeros2.get(i));
        }
        System.out.println(numeros+"\n"+numeros2+"\n"+maximos);

    }
}
