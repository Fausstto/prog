package ud06.actividades.ejercicios;
//Desarrolla una aplicación que cree un vector con los número 1 al 10 en cualquier orden y
//muestre primero todos los pares y después todos los impares.
import java.util.ArrayList;
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> pares = new ArrayList<>();
            ArrayList<Integer> inpares = new ArrayList<>();
            int[] diez ={1,2,3,4,5,6,7,8,9,10};

            for (int i = 0; i <= diez.length; i++) {
                if (i % 2 == 0) {
                    pares.add(i);
                } else {
                    inpares.add(i);
                }
            }
            System.out.println("Los numeros pares son: ");
            for(Integer n : pares){ System.out.print(n); }
            System.out.println();
            System.out.println("Los numeros inpares pares son: ");
            for(Integer n : inpares){ System.out.print(n); }
    }

}

