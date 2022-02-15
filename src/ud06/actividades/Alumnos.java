package ud06.actividades;
import ud05.actividades.ejercicios1.Alumno;
/*
import java.util.Scanner;
public class Alumnos {
    private String nombre;
    private double nota;

    public Alumnos() {
        nombre="";
        nota=0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public void pedirDatos(){
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("dime el nombre del alumno");
            nombre = sc.nextLine();
        }while(nombre.equals(""));

        do{
            System.out.println("dime el nombre del alumno");
            nota= sc.nextDouble();
        }while(nota<0||nota<10);
    }

    public static void main(String[] args) {
        int numAlumnos=0;
        double mediaNotas=0.0;

        Scanner sc=new Scanner(System.in);
        Alumnos[] arrayAlumnos;
        System.out.println("Cuantos alumnos hay en la clase : ");
        numAlumnos=sc.nextInt();
        arrayAlumnos= new Alumnos[numAlumnos];

        for(int i=0;i<arrayAlumnos.length;i++){
            arrayAlumnos[i]=new Alumnos();
        }
        for(int i=0;i<arrayAlumnos.length;i++){
            System.out.println("Dime los datos del alumno"+(i+1)+" : ");
            arrayAlumnos[i].pedirDatos();
        }
        System.out.println("La nota media de la clase es");
        for(int i = 0;i<arrayAlumnos.length;i++){
            mediaNotas=mediaNotas+arrayAlumnos[i].getNota();
        }
        mediaNotas=mediaNotas/arrayAlumnos.length;
        System.out.println(mediaNotas);
    }

}
*/
