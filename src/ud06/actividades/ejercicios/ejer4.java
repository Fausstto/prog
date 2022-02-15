package ud06.actividades.ejercicios;
//Desarrolla una aplicación que pida 10 número negativos, los almacena en un vector y los
//muestre por pantalla. Si el usuario introduce un número positivo se volverá a pedir.
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 10 numeros negativos");

        int[] arr = new int[10];
        int numero=-1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce numero");
            numero=sc.nextInt();
            while (numero>0) {
                System.out.println("No es un numero negativo, Otra vez");
                numero=sc.nextInt();
            }
            arr[i] = numero;
        }
        for (int i : arr) {
            System.out.print(i+",");
        }


    }
}