package ud05.actividades.documentacion;
import java.util.Random;
import java.util.Scanner;



    /**
     * Juego piedra, papel o tijeras
     *
     * */
    public class JuegoPPT {
        public static void main(String[] args){

            /**contadores de partidas ganadas*/
            int cUsuario=0, cOrdenador=0;

            /**gestos jugados*/
            char gestoUsuario = '\0', gestoOrdenador='\0';

            /**contador de partidas*/
            int partidas = 0;

            Scanner sc = new Scanner(System.in);
            Random random = new Random();           /**generador de numero aleatori*/
            int aleatorio;

            System.out.println("Comencemos...");

            while(gestoUsuario != 's'){  /**Turno*/

                System.out.println("\nPiedra-Papel-Tijeras");
                System.out.println("Tu turno (Teclea t para tijeras, p para papel, x para piedra, s para salir)");
                gestoUsuario = sc.next().charAt(0);

                if(gestoUsuario == 's')
                    break;

                //Juega el ordenador
                aleatorio = random.nextInt(3) + 1;
                switch (aleatorio) {
                    case 1: gestoOrdenador='t'; break;
                    case 2: gestoOrdenador='p'; break;
                    case 3: gestoOrdenador='x'; break;
                }
                System.out.println("Mi turno (Ordenador): " + gestoOrdenador);

                //Comprueba quien gana
                if(gestoUsuario == gestoOrdenador)	//Si hay empate...
                    System.out.println("¡Empate!");

                else if((gestoOrdenador=='t'&&gestoUsuario=='p')||(gestoOrdenador=='p'&&gestoUsuario=='x')||(gestoOrdenador=='x'&&gestoUsuario=='t')){
                    System.out.println("¡Has perdido!");
                    cOrdenador++;
                } else {
                    System.out.println("¡Has ganado!");
                    cUsuario++;
                }

                partidas++;
            }

            //calcula porcentajes
            double pUsuario=0.0;
            double pOrdenador=0.0;
            if (partidas!=0){
                pUsuario = (cUsuario*100.0)/partidas;
                pOrdenador = (cOrdenador*100.0)/partidas;
            }

            //Muestra resultados finales del juego
            System.out.println("Número de partidas: " + partidas);
            System.out.print("Yo gané " + cOrdenador + "("+pOrdenador+"%).");
            System.out.print("Tú ganaste " + cUsuario + "("+pUsuario+"%).");
            System.out.println("\nAdiós!");
        }
    }



