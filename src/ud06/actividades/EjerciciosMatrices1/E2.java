package ud06.actividades.EjerciciosMatrices1;

import java.util.Random;

//Escribe un programa que genere una matriz de 10 por 10 enteros aleatorios. Después
//se pedirá un entero al usuario. Se buscará dicho entero en la matriz. Si este se encuentra
//en ella se indicará cuál es su posición (fil, col) y después se mostrará la matriz para
//comprobarlo. En caso contrario se indicará que este no se encuentra en la matriz.
public class E2 {
    public static void main(String[] args) {
        Random rd = new Random();

        int matriz[][]= new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for(int j =0; j< matriz[0].length;j++){
                matriz[i][j]=rd.nextInt(11);
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println("");
        }

    }
}
