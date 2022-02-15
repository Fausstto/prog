package ud07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindromo {
    public static void main(String[] args) {
        boolean palindromo = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Intreuduce un palindromo");
        Queue<Character> colaletras = new LinkedList<>();
        Stack<Character> pilaletras = new Stack<>();
        String palabra = sc.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            colaletras.offer(palabra.charAt(i));
            pilaletras.push(palabra.charAt(i));
        }
        while (!colaletras.isEmpty()) {


            if (pilaletras.pop() != colaletras.poll()) {
                palindromo = false;
            }
        }
        if (palindromo == false) {
            System.out.println("no ess un palindromo");
        } else
            System.out.println("es un palindromo");
    }
}
