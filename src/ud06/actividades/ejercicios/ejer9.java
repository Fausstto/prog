package ud06.actividades.ejercicios;

import java.util.Random;
import java.util.Scanner;

//Desarrolla una aplicación que genere dos vectores de 10 números enteros aleatorios y
//muestre por pantalla la suma de ambos.
public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int numero,numero2,suma = 0;

        for (int i = 0; i < arr.length; i++) {
            numero =  rand.nextInt(100) + 1;

            arr[i] = numero;
            suma=suma+numero;
        }
        for (int i = 0; i < arr2.length; i++) {
            numero2 =  rand.nextInt(100) + 1;

            arr2[i] = numero2;
            suma=suma+numero2;
        }

        for (int i : arr) {
            System.out.print(i + ",");
        }
        for (int i : arr2) {
            System.out.print("\n"+i + ",");
        }
        System.out.println("\n"+suma);

    }


}
