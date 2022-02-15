package pruebasEd;
import java.util.Scanner;
public class Adivinanumero {



        public static void main(String[] args) {

            int nSecreto, intentos =5,i,nIntroducido;
            boolean acertaste=false;

            Scanner sc= new Scanner(System.in);

            nSecreto=(int)(Math.random()*10+1);
            for (i=1;i<=intentos && acertaste==false;i++){
                System.out.println("Adivina el número: ");
                nIntroducido=sc.nextInt();
                if (nSecreto==nIntroducido){
                    acertaste=false;
                } else {
                    if (nIntroducido>nSecreto){
                        System.out.println("El número secreto es menor");
                    } else {
                        System.out.println("El número secreto es mayor");
                    }
                }
            }
            if (acertaste==true){
                System.out.println("Has acertado");
            } else {
                System.out.println("Has alcanzado el máximo de intentos");
            }
        }
    }

