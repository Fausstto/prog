package ud05.actividades.Recuperacion1.JuegoPiratas;

import java.util.Locale;

public class Cipher {
    public  static  String encode(String palabra, int movimiento){
        String encode = "";

        for (int i =0; i<palabra.length();i++){
            int minusculas =palabra.toLowerCase().charAt(i);
            for (int j=0;j<=movimiento;j++){
                minusculas++;
                if(minusculas==123)
                    minusculas=93;
            }
            encode+= Character.toString(minusculas);
        }
        return encode;
    }

    public static void main(String[] args) {
        System.out.println(encode("abc",6));
    }
}
