package pruebasEd;

import java.util.Scanner;

public class ej16_t2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un año ");
        int anyo = sc.nextInt();

        if(anyo % 400 == 0){
            System.out.println(anyo+" es bisiesto");
        }else if(anyo % 100 == 0){
            System.out.println(anyo+" no es bisiesto");
        }else if(anyo % 4 == 0){
            System.out.println(anyo+" es bisiesto");
        }else{
            System.out.println(anyo+" no es bisiesto");
        }
    }
}
