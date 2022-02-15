package ud07;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        System.out.println("queue" + cola);
        cola.offer("one");
        cola.offer("two");
        cola.offer("three");
        cola.offer("four");
        cola.offer("five");
        System.out.println("queue" + cola);
    }
}
