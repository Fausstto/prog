package ud06.actividades;

import java.util.Scanner;

public class PrintArrayInStarts {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de elementos :");
        int longitud = sc.nextInt();
        int[]  numItems = new int[longitud];


        for(int i = 0; i < numItems.length; i++) {
            System.out.print("Elemento"+(i+1) + ": ");
            numItems[i] = sc.nextInt();
        }

        for(int i = 0; i < numItems.length; i++) {
            System.out.print(i+" : ");
            for(int j = 0; j < numItems[i]; j++){
                System.out.print("*");
            }
            System.out.println("("+numItems[i]+")");
        }

    }
}

