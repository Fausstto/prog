package ud07;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.*;

public class E01_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        boolean continuar = false;
        int valor= 0,opcion=0,indice =0;
        char respuesta=' ';
        do {
            System.out.println("Introduce un valor entero");
            valor = sc.nextInt();
            lista.add(valor);
            do {
                System.out.println("Quiere continuar ?S/N");
                respuesta = sc.next().charAt(0);
            } while (respuesta !='S' && respuesta!='N');

            if(respuesta=='N') {
                System.out.println("Okey...");
                break;
            } else
                continuar=true;

       }while(continuar);

        System.out.println("Introduce una opcion\n1 Mostrar lista\n" +
                "2 Mostrar mayor, menor y media\n" +
                "3 Borrar un elemento de una posición concreta\n" +
                "4 Borrar un elemento de un valor concreto\n" +
                "5 Añadir un elemento al final\n" +
                "6 Cambiar valor de un elemento por su posición\n" +
                "7 Cambiar valor de un elemento por su valor");
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
                for(int i: lista){
                    System.out.print(i+" ");
                }
                break;
            case 2:
                int max= Collections.max(lista);
                int min= Collections.min(lista);
                System.out.println("Max :" + max+"\nMin: "+ min);
                break;
            case 3:
                System.out.println("Introduce la posicion del valor que quieras eliminar de la lista");
                indice = sc.nextInt();
                System.out.println(lista);
                lista.remove(indice);
                break;
            case 4:
                System.out.println("Introduce el valor que quieras eliminar de la lista");
                valor = sc.nextInt();
                System.out.println(lista);
                lista.remove(Integer.valueOf(valor));
                break;
            case 5:
                System.out.println("Introduce un valor al final");
                System.out.println(lista);
                lista.add(sc.nextInt());
                System.out.println(lista);
                break;
            case 6:
                System.out.println("Cambia el valor de un elemento por su posicion");
                System.out.println("Posicion :");
                indice=sc.nextInt();
                System.out.println("Valor nuevo");
                lista.set(indice, sc.nextInt());
                System.out.println(lista);
                break;
            case 7:
                System.out.println("Cambia el valor de un elemento por su valor");
                System.out.println("Valor antiguo :");
                valor=sc.nextInt();
                System.out.println("Valor nuevo");
                lista.set(lista.indexOf(valor), sc.nextInt() );
                System.out.println(lista);
                break;
        }
    }
    
}
