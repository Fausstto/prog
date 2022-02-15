package ud06.actividades;

import java.util.Vector;

public class VectorContiene {
    public boolean contiene(int[] array, int key){

        for(int i=0;i<array.length;i++){
            if(array[i]==key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        VectorContiene  vc = new VectorContiene();

        int [] vector = {4,5,6,7};
        System.out.println(vc.contiene(vector,5));

    }

}
