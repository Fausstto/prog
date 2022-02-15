package ud05.actividades.depurador;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Juego del ahorcado
 */
public class Ahorcado {

    static private final String[] palabras_secretas = {"reingenieria", "cubeta","tunelizacion", "protocolo",
            "puertos", "conexion", "broadcasting", "direccion","internet", "router", "switch", "wifi", "estandar",
            "socket", "transporte","enlace", "capas", "arquitectura", "cliente", "servidor", "proxy", "firewall","redes",
            "LAN", "WAN", "MAN", "hub", "concentrador", "datagrama", "puente","fibra", "TCP", "UDP", "mascara", "gateway",
            "servidor", "DNS", "cliente","conmutacion", "circuito", "satelite", "coaxial", "microondas", "seÃ±al","ingrarrojos",
            "token", "anillo", "bus", "control", "flujo", "congestion","enrutamiento", "aplicacion", "correo", "peertopeer"};

    public static String damePalabraAleatoria(){
        List<String> palabras = Arrays.asList(palabras_secretas);
        Collections.shuffle(palabras);
        return palabras.get(0);
    }

    public static void main(String[] args) {

        //String pSecreta=Ahorcado.damePalabraAleatoria();
        String pSecreta="puerto";
        String pProgreso="-".repeat(pSecreta.length());

        String pUsuario;
        String letra;

        int intentos = 0;

        boolean adivina=false;
        boolean haAcertado=false;

        Scanner sc = new Scanner (System.in);
        //System.out.println(pSecreta);

        while(!adivina){
            System.out.print("Ingresa una letra o la palabra a adivinar: ");
            pUsuario = sc.nextLine();
            intentos++;
            if (pUsuario.length()==1) { //Ha ingresado una letra
                letra = ""+pUsuario.charAt(0);  //Convierto char a cadena
                boolean esParte = pSecreta.toUpperCase().contains(letra.toUpperCase());

                if (esParte)
                    for (int i = 0; i < pSecreta.length(); i++) {
                        if (letra.equalsIgnoreCase(""+pSecreta.charAt(i)))
                            pProgreso=pProgreso.substring(0,i)+letra+pProgreso.substring(i+1);
                    }

                System.out.println("Intento " + intentos + ": " + pProgreso+"\n");
                haAcertado = pProgreso.equalsIgnoreCase(pSecreta);
                if (haAcertado)
                    adivina=true;

            } else { //Ha ingresado una palabra
                haAcertado = pSecreta.equalsIgnoreCase(pUsuario);
                if (haAcertado)
                    adivina=true;
                else
                    System.out.println("No es esa la palabra secreta. Llevas " + intentos + " intentos: " +  pProgreso + "\n");
            }
        }
        System.out.println("Enhorabuena!! Adivinaste en " + intentos + " intentos");
    }
}
