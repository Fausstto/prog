package ud06.actividades.ejercicios;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 20 letras");

        char[] arr = new char[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == 'a'){
                System.out.print(arr[i]+" Posicion= "+i + ", ");
            }
        }
    }
}
