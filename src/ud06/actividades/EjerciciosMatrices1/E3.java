package ud06.actividades.EjerciciosMatrices1;

//Escribe un programa que pida 20 números enteros. Estos números se deben introducir
//en una matriz de 4 filas por 5 columnas. El programa mostrará las sumas parciales de
//filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe
//aparecer en la esquina inferior derecha.

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, c;
        int sumaFila, sumaColumna, sumaTotal = 0;
        int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
        System.out.println("Introduce");
        for (i = 0; i < 4; i++) {
            for (c = 0; c < 5; c++) {
                System.out.print("Fila " + i + ", c " + c + ": ");
                num[i][c] = sc.nextInt();
            }
        }
        for (i = 0; i < 4; i++) {
            sumaFila = 0;
            for (c = 0; c < 5; c++) {
                System.out.printf("%7d   ", num[i][c]);
                sumaFila += num[i][c];
            }
            System.out.printf("=\n", sumaFila);
        }
            System.out.println();

        for (c = 0; c < 5; c++) {
            sumaColumna = 0;
            for (i = 0; i < 4; i++) {
                sumaColumna += num[i][c];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
    }
}

