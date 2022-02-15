package ud06.actividades;

public class SumDigits {
    public static void main(String[] args) {
        String cadena = args[0];
        int suma = 0;
        System.out.printf("Sum of digits");
        for (int i = 1; i < cadena.length(); i+=2) {
            int digit = Integer.parseInt(cadena.substring(i, i + 1));
            suma += digit;
            System.out.println(digit);
            if (i < cadena.length() - 1)
                System.out.printf(" + ");
            else
                System.out.println(" = " + suma);

        }


    }
}
