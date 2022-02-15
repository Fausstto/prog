package ud06.actividades;

import java.util.Arrays;

public class PruebaArray {
    public static void main(String[] args) {
        int[] notas1 ;

        /*inicialixzacion*/
        int[] notas = new int [6];
        notas [0]=1;
        notas [1]=2;
        notas [2]=3;
        notas [3]=7;
        notas [4]=8;
        notas [5]=100;

        System.out.println(notas[5]);
        System.out.println(Arrays.toString(notas));
        //inicializacion
        int[] notasAlumnos={10,10,10,10,10,10};
        System.out.println(Arrays.toString(notasAlumnos));

        int[] notas2 ={2,3,4,5,6};
        String[] asignaturas ={"mates","lengua","fisica","ramon"};
        System.out.println(Arrays.toString(asignaturas));

        //inicializacion con bucle for
        int[] notasAlumno2 = new int[100];

        for(int i=0;i<notasAlumno2.length;i++){
            notasAlumno2[i]=0;
        }
        System.out.println(Arrays.toString(notasAlumno2));

    }
}
