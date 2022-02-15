package ud06.actividades.ejercicios;

import java.util.Scanner;

public class ejer10 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double suma=0 , media, mayor=0.0,menor=100.0;
            System.out.println("Introduce la cantidad de  alumnos");
            int length = sc.nextInt();
            double[] arr = new double[length];

            for (int i = 0; i < length; i++) {
                System.out.println("Introduce nota del "+i+" alumno");
                arr[i] = sc.nextDouble();
                suma=suma+arr[i];
                if(mayor<arr[i])
                    mayor=arr[i];
                if(menor>arr[i])
                    menor=arr[i];

            }
            for (double i : arr) {
                System.out.print(i+',');
            }
            media = suma/length;
            System.out.println("Media"+media+"mayor"+mayor+"menor"+menor);
        }
    }

