package ud06.actividades.ejercicios;

import java.util.Scanner;

//Desarrolla una aplicación que pida al usuario 10 números positivos y 10 posiciones de un
//vector. La aplicación introducirá cada número en su posición. Si el usuario introduce un
//número negativo o una posición que ya esté ocupada se mostrará un error y se pedirán de
//nuevo esos datos.
public class ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 10 numeros y cada posicion");

        int[] arr = new int[10];
        int numero=-1;
        int posicion;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce numero");
            numero=sc.nextInt();
            while (numero<0) {
                System.out.println("No es un positivo, Otra vez");
                numero=sc.nextInt();
            }
            System.out.println("introduce posicion");
            posicion= sc.nextInt();
            while (posicion!=0) {
                System.out.println("posicion cogida,Otra vez");
                posicion= sc.nextInt();
            }
            arr[posicion] = numero;

        }
        for (int i : arr) {
            System.out.print(i+",");
        }


    }
}
