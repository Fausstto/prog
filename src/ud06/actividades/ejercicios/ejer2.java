
package ud06.actividades.ejercicios;
//Desarrolla una aplicación que pida a un usuario cuantos números con decimales quiere
//introducir por teclado, cree un vector con ese tamaño, le pida los datos y los muestre.
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce la cantida de  de numeros decimales que vas a introducir");
        int length= sc.nextInt();
        double[] arr = new double[length];

        for(int i=0;i<4; i++){
            System.out.println("Introduce numero");
            arr[i]= sc.nextDouble();
        }
        for(double i:arr){
            System.out.println(i);
        }

    }
}
