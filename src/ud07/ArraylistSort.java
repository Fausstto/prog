package ud07;

import java.util.*;

public class ArraylistSort {
    public static void main(String[] args) {


        List<String> paises = new ArrayList<>();
        paises.add("India");
        paises.add("espania");
        paises.add("francia");
        paises.add("italia");

        for(String pais:paises){
            System.out.println(pais);
        }
        Collections.sort(paises);
    }
}
