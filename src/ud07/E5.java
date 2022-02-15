package ud07;

import com.sun.source.tree.UsesTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         List<Integer> listaEnlazada = new LinkedList<>();

         listaEnlazada.add(4);
         listaEnlazada.add(7);
         listaEnlazada.add(8);
         listaEnlazada.add(5);
         listaEnlazada.add(4);
         listaEnlazada.add(3);

        System.out.println(listaEnlazada);
        System.out.println(" Introduce que posiciones quieres intercambiar\nposicion1 :");
        int posiocion1 = sc.nextInt();

        Integer uno = listaEnlazada.get(posiocion1);
        System.out.println("posicion 2 :");
        int posiocion2 = sc.nextInt();

        Integer dos = listaEnlazada.get(posiocion2);

        listaEnlazada.set(posiocion1, dos);
        listaEnlazada.set(posiocion2,uno);
        System.out.println(listaEnlazada);

    }

}
