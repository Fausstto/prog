package ud06.actividades;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {

        double numeros[] = {31.43, 44.22};

        System.out.println("Antes de la  ordenacion: ");

        for (double numero : numeros)
            System.out.print(numero + "");

        Arrays.sort(numeros);

        System.out.println("\nDespues de la ordenacion");
        for(double numero:numeros)
            System.out.println(numero +"");
    }
}
