package ud07;


import java.util.ArrayList;
import java.util.List;

public class E3 {
    public List<Integer> listaUnion (List < Integer > list1, List < Integer > list2){
        List<Integer> union = list1;

        for(int i =0; i<list2.size();i++){
            union.add(list2.get(i));
        }
        return union;
    }
    public List<Integer> listaInterseccion (List < Integer > list1, List < Integer > list2){
        List<Integer> interseccion = list1;

        for(int i =0; i<list2.size();i++){
            if(list1.contains(list2.get(i))){
                if(!(interseccion.contains(list2.get(i))))
                    interseccion.add(list2.get(i));
            }

        }
        return interseccion;
    }
   


    public static void main(String[] args) {
        E3 lista= new E3();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);
        list2.add(3);list2.add(7);list2.add(1);list2.add(9);list2.add(10);
        System.out.println(lista.listaUnion(list1,list2));
        System.out.println(lista.listaInterseccion(list2,list1));
    }
}
