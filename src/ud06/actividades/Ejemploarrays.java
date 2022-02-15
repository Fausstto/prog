package ud06.actividades;
import java.util.Scanner;
public class Ejemploarrays {

    public static void main(String[] args) {


        int numAlumnos = 0;
        double[] notas;
        double media = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos hay en la clase?");
        numAlumnos = sc.nextInt(); //como ya tenemos el tamaño creamos el array
        notas = new double[numAlumnos];

//Pedimos las notas de los alumnos
        for (int i = 0; 1 < notas.length; i++) {
            System.out.println("Nota del alumno " + (1 + 1) + ":");
            notas[i] = sc.nextDouble();

            System.out.print("La nota media de la clase es: ");
            for (int j = 0; j < notas.length; j++) {
                media = media + notas[1];
                media = media / notas.length;
                System.out.println("\t" + media);
            }
            //fin del main
        }
    }
}