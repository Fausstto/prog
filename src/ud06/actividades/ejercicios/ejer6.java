package ud06.actividades.ejercicios;

import java.util.Random;
import java.util.Scanner;

//Desarrolla una aplicación que cree un vector con 5 números enteros aleatorios y muestre por
//pantalla el vector completo, el número más grande y el más pequeño.\
public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] arr = new int[5];
        int numero,mayor=0,menor=101;

        for (int i = 0; i < arr.length; i++) {
            numero= rand.nextInt(100)+1;
            arr[i] = numero;

        }
        for (int i : arr) {
            System.out.print(i+",");
        }
        for (int i = 0; i < arr.length; i++) {
            if(mayor<arr[i])
                mayor=arr[i];
            if(menor>arr[i])
                menor=arr[i];
        }


        System.out.println("\nEl mayor es: "+mayor);
        System.out.println("El menor es: "+menor);


    }
}
