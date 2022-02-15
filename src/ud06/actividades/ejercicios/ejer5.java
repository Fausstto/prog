package ud06.actividades.ejercicios;
//Desarrolla una aplicación que cree un vector con 10 números enteros aleatorios, los muestre
//por pantalla y calcule la suma y el producto de todos ellos.
import java.util.Scanner;
import java.util.Random;
public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] arr = new int[10];
        int numero;
        for (int i = 0; i < arr.length; i++) {
            numero= rand.nextInt(100)+1;
            arr[i] = numero;
        }
        for (int i : arr) {
            System.out.print(i+",");
        }


    }
}
