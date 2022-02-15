package ud07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PruebaTreeMap {

        public static void main(String[] args) {


            Map<Integer, String> treemap = new TreeMap<>();
            treemap.put(1, "Casillas");
            treemap.put(2, "Ramos");
            treemap.put(3, "pique");
            treemap.put(4, "busquets");
            treemap.put(5, "ibai");

            Iterator it = treemap.keySet().iterator();
            while (it.hasNext()) {
                Integer key = (Integer) it.next();
                System.out.println(" clave :" + key +
                        " -> Valor : " + treemap.get(key));
            }
    }
}
