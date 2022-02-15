package ud06.actividades;

public class matrix {

    public int [][] crearmatriz(int filas, int col){
        int[][] mat = new int [filas][col];
        for(int f=0; f< mat.length; f++){
            for(int c=0; c<mat[f].length;c++){
                mat[f][c]=(int)(Math.random()*10+1);
            }
        }
        return mat;
    }
/*
    public static void print(int[][] m);
    public static void print(double [][] m);
    public static boolean havesameDimension (int [][] m1, int[][] m2); // Used in add (), subtract ()
    public static boolean havesameDimension (double [][] m1, double[][] m2);
    public static int[][] add(int[]0 mi, int[][] m2);
    public static double[][] add(double [] [] m1, double[][] m2);
    public static int[][] subtract (int [][] m1, int[][] m2);
    public static double[][] subtract (double[][] m1, double [][] m2) ;
    public static int[][] multiply (int[][] m1, int[][] m2);
    public static double[][] multiply (double[][] m1, double [][] m2);*/
}
