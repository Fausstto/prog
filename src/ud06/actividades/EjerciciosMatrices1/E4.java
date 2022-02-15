package ud06.actividades.EjerciciosMatrices1;

import java.util.Random;

//Realiza un programa que rellene una matriz de 6 filas por 10 columnas con números
//enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el
//programa deberá dar la posición tanto del máximo como del mínimo.
public class E4 {
    public static void main(String[] args) {
        Random rd= new Random();
        int fila;
        int columna;
        int matriz[][]= new int[6][10];
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int fMin = 0;
        int columnaMinimo = 0;
        int fMax = 0;
        int columnaMaximo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for(int j =0; j< matriz[0].length;j++){
                matriz[i][j]=rd.nextInt(1001);
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
}
