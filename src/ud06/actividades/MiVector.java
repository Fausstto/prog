package ud06.actividades;
import java.util.Scanner;
import java.util.Arrays;

public class MiVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int longitud = 5;
        int[]  numeros = new int[longitud];

        int multiplicacion=numeros[0];
        int sumasPares=numeros[0];


        for(int i = 0; i < numeros.length; i++) {
            System.out.println("elemento"+(i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Multiplicacion :");
        for(int i = 0; i < numeros.length; i++) {
            multiplicacion= numeros[i]*2;
            System.out.print(multiplicacion+",");
        }
        System.out.println("\nNumeros pares :");
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0)
                System.out.print(numeros[i]+",");
        }
    }
}
