package ud07;

import java.util.*;

public class E8_Dino {
    private String nombre;
    private double peso;
    private long anios;

    public E8_Dino(String nombre, double peso, long anios) {
        this.nombre = nombre;
        this.peso = peso;
        this.anios = anios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public long getAnios() {
        return anios;
    }

    public void setAnios(long anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return "E8_Dino{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", anios=" + anios +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<E8_Dino> dinosaurios = new LinkedList<>();
        for(int i=0; i<3; i++){
            System.out.println("Introduce un dinosaurio");
            dinosaurios.add(new E8_Dino(sc.next(),sc.nextDouble(),sc.nextLong()));
        }
        System.out.println(dinosaurios);

    }

}
