package ud07;

import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<Integer> pila= new Stack<>();
        System.out.println("stack"+pila);

        pila.push(10);
        pila.push(15);
        pila.push(80);
        System.out.println("stack"+pila);

        while(!pila.isEmpty())
            System.out.println(pila.pop());
    }
}
