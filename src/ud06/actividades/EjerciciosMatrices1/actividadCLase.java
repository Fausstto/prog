package ud06.actividades.EjerciciosMatrices1;

public class actividadCLase {

        public static void main(String[] args) {


            int matriz[][]= new int[5][5];
            int longitud = matriz.length-1;
            for (int i = 0; i < matriz.length; i++) {
                for(int j =0; j< matriz[0].length;j++){
                    matriz[i][j]=1;
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
            matriz[0][0]=0;
            matriz[0][longitud]=0;
            matriz[longitud][0]=0;
            matriz[longitud][longitud]=0;
            System.out.println();

            for (int i = 0; i < matriz.length; i++) {
                for(int j =0; j< matriz[0].length;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }

