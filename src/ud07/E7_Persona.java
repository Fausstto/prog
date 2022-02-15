package ud07;

import java.util.*;

public class E7_Persona {
    private int id;
    private String nombres;
    private String apellidos;

    public E7_Persona(int id, String nombres, String apellidos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "E7_Persona{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<E7_Persona> personas = new LinkedList<>();

        personas.add(new E7_Persona(1,"Juan","Ramiro"));
        personas.add(new E7_Persona(2,"pepe","frega"));
        personas.add(new E7_Persona(3,"raamon","caampos"));
        personas.add(new E7_Persona(4,"ibai","si"));
        System.out.println(personas);
        System.out.println("Introduce una persona");
        personas.add(new E7_Persona(sc.nextInt(), sc.next(), sc.next()));
        System.out.println(personas+"\nQuiere introducir alguna persona mas?S|N");
        char respuesta= sc.next().charAt(0);


    }
}
