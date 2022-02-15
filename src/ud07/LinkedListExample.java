package ud07;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Steve");
        list.add("car");
        list.add("Raj");

        list.addFirst("Rick");
        list.addLast("Negan");
        list.add(2,"Glen");

        Iterator<String> iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
