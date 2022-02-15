package ud06.actividades;

import java.util.Arrays;
import java.util.Scanner;

public class VectorEnteros {
    public static void main(String[] args) {



        System.out.println("Ingresa la cantidad de elementos");
        Scanner sc = new Scanner(System.in);

        int suma=0;
        int longitud = sc.nextInt();
        int[]  numeros = new int[longitud];



        for(int i = 0; i < numeros.length; i++) {
            System.out.println("elemento"+(i+1) + ": ");
            numeros[i] = sc.nextInt();
        }


        System.out.println(Arrays.toString(numeros));

        int nMayor = numeros[0];
        int nMenor = numeros[0];

            for(int i = 0; i < numeros.length; i++){
                if (numeros[i] > nMayor)
                    nMayor = numeros[i];

                if(numeros [1]< nMenor)
                    nMenor = numeros[i];

                suma += numeros[i];
            }
        System.out.println("Suma :"+suma);
        System.out.println("Nmayor :"+nMayor);
        System.out.println("nMenor :"+nMenor);

    }
}
