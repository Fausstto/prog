package ud06.actividades;

public class matriz {
    public int [][] crearmatriz(int filas, int col){
        int[][] mat = new int [filas][col];
        for(int f=0; f< mat.length; f++){
            for(int c=0; c<mat[f].length;c++){
                mat[f][c]=(int)(Math.random()*10+1);
            }
        }
        return mat;
    }
    public void muestraMatriz( int [][] mat){
        for(int f=0; f<mat.length;f++){
            for(int  c=0;c<mat[f].length;c++){
                System.out.println(mat[f][c]+ " ");
            }
        }
        System.out.println();
    }
    /*
    public int [][] sumaMatriz( int [][] sl1, int [][] s2){
        int[][] res=new int[s1.length][s1[0].length];
        for(int f=0; f< res.length);
    }*/
}
