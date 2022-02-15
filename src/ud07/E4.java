package ud07;


import java.util.ArrayList;
import java.util.List;

public class E4 {
    public List<Integer> listaUnion (List < Integer > list1, List < Integer > list2){
        List<Integer> listUnion = list1;
        listUnion.retainAll(list2);
        return listUnion;
    }
    public List<Integer> listaInterseccion (List < Integer > list1, List < Integer > list2){
        List<Integer> listInterseccion = list2;
        listInterseccion.addAll(list1);
        return listInterseccion;
    }
    public List<Integer> listaEliminar (List < Integer > list1, List < Integer > list2){
        List<Integer> listeliminar = list2;
        listeliminar.removeAll(list1);
        return listeliminar;
    }


    public static void main(String[] args) {
        E4 lista2= new E4();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);
        list2.add(3);list2.add(7);list2.add(1);list2.add(9);list2.add(10);
        System.out.println(lista2.listaUnion(list1,list2));
        System.out.println(lista2.listaInterseccion(list1,list2));
        System.out.println(lista2.listaEliminar(list1,list2));
    }
}