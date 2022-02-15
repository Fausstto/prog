package ud07;
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> diccionario = new HashSet<>();

        diccionario.add("tetera");
        diccionario.add("asesinato");
        diccionario.add("roja");
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        String[] arrayPalabras =  frase.split(" ");
        Set<String> frasePalabras = Set.of(arrayPalabras);
    
        for(String palabra: frasePalabras){
            if(!diccionario.contains(palabra))
                System.out.println(palabra+ " ERRoR");
        }
    }
}
