package ud06.actividades.ejercicios;

import java.util.Scanner;

//Desarrolla una aplicación que pida 10 caracteres al usuario y muestre en orden inverso dichos
//caracteres.
public class ejer8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        char[] arr = new char[10];
        for (int i = 0 ; i < arr.length; i++) {
            System.out.println("Introduce una letra");
            arr[i]=sc.next().charAt(0);
        }
        for (int i = 9 ; i > 0; i--) {
            System.out.print(arr[i]+",");
        }
    }
}
