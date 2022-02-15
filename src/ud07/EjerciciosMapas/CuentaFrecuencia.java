package ud07.EjerciciosMapas;

import java.util.*;


public class CuentaFrecuencia {
    static private final String[] palabras_secretas = {"reingenieria", "cubeta","tunelizacion", "cubeta",
            "cliente", "conexion", "broadcasting", "direccion","internet", "router", "switch", "wifi", "estandar",
            "socket", "transporte","enlace", "cubeta", "arquitectura", "cliente", "servidor", "proxy", "firewall","redes",
            "LAN", "WAN", "MAN", "hub", "concentrador", "datagrama", "puente","fibra", "TCP", "UDP", "mascara", "gateway",
            "servidor", "DNS", "transporte","conmutacion", "circuito", "satelite", "cliente", "microondas", "seÃ±al","ingrarrojos",
            "token", "anillo", "bus", "control", "flujo", "circuito","enrutamiento", "cliente", "correo", "peertopeer"};


    public static void main(String[] args) {
        Map<String, Integer> mapaPalabras = new HashMap<>();


       for(String palabra: palabras_secretas)   {
            if(mapaPalabras.containsKey(palabra))
                 mapaPalabras.put(palabra,mapaPalabras.get(palabra)+1);
            else
                mapaPalabras.put(palabra,1);
        }


        mapaPalabras.forEach((k,v)->{System.out.println(k +" -> "+ v );});

    }
}
