package ud06.actividades.EjerciciosMatrices1;
//Escribe un programa que cree una matriz de 5x5, almacene los números del 1 al 25 y
//luego la muestre por pantalla.
public class E1 {
    public static void main(String[] args) {


        int matriz[][]= new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for(int j =0; j< matriz[0].length;j++){
                matriz[i][j]=(i*matriz.length)+(j+1);
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println("");
        }

        }
    }


