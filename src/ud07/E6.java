package ud07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Mueble> mobiliario = new ArrayList<>();

        int opcion=0,x=0;
        boolean respuesta=true;
        mobiliario.add(new Mueble("silla",40,"roxy"));



        System.out.println("1. Insertar Mobiliario.\n" +
                "2. Eliminar elemento de Mobiliario. Mostrar primero los elementos con foreach, y preguntar\n" +
                "por el nombre del elemento que se quiera borrar.\n" +
                "3. Mostrar mobiliario. Preguntar si lo desea en orden ascendente o descendente.\n" +
                "4. Salir.");

         opcion= sc.nextInt();
        switch (opcion) {
            case 1:
                while (x==0){
                    System.out.println("Inserta Mobiliario(nombre,precio,marca");
                    String nombre= sc.next();
                    mobiliario.add(new Mueble(sc.next(),sc.nextInt(),sc.next()));


                    System.out.println("Quiere continuar ?(s/n");
                    char SiNo = sc.next().charAt(0);
                    if (SiNo == 'n')
                        break;
                    if (SiNo != 'n' && SiNo != 's') {
                        System.out.println("Eso no es una respuesta");
                        break;
                    }
                }
                break;
            case 2:
                    for(Mueble elemento  :mobiliario){
                        System.out.println(elemento);
                    }
                    sc.nextLine();
                    System.out.println("introduce el elemento que va s a eliminar");
                    mobiliario.remove(sc.nextLine());
                    System.out.println(mobiliario);
                    break;
            /*
            case 3:

                System.out.println("Mostrar mobiliario" + "\nascendente(a) o descendente(d)?");
                char orden = sc.next().charAt(0);
                if(orden=='a'){
                    Collections.sort(mobiliario);
                    System.out.println(mobiliario);
                }
                if(orden=='d') {
                    Collections.sort(mobiliario, Collections.reverseOrder());
                    System.out.println(mobiliario);
                }
                if(orden!='a' && orden!='d')
                    System.out.println("Eso no es una respuesta");
                break;
             */
            case 0:
                System.out.println("Salir");
        }

    }
}
