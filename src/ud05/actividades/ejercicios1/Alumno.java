package ud05.actividades.ejercicios1;

public class Alumno {
    private String dni;
    private int edad;
    private int notaT1;
    private int notaT2;
    private int notaT3;
    public Alumno() {
        this("",0,0,0,0);
    }

    public Alumno(String dni, int edad, int notaT1, int notaT2, int notaT3) {
        this.dni = dni;
        this.edad = edad;
        this.notaT1 = notaT1;
        this.notaT2 = notaT2;
        this.notaT3 = notaT3;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNotaT1() {
        return notaT1;
    }

    public void setNotaT1(int notaT1) {
        this.notaT1 = notaT1;
    }

    public int getNotaT2() {
        return notaT2;
    }

    public void setNotaT2(int notaT2) {
        this.notaT2 = notaT2;
    }

    public int getNotaT3() {
        return notaT3;
    }

    public void setNotaT3(int notaT3) {
        this.notaT3 = notaT3;
    }

    public int notaFinal(){
        if(notaT1==0){notaT1=-1;}
        if(notaT2==0){notaT1=-1;}
        if(notaT3==0){notaT1=-1;}
       return (notaT1 + notaT2 +notaT3)/3 ;

    }
    public String informeAlumno(){
        return String.format ("\nNota Final :" + notaFinal());
    }
    public String toString(){
        return String.format("DNI"+dni +
                "\nEdad :"+ edad +
                "\nNotas :" + notaT1+","+ notaT2+","+ notaT3 + "/nNota Final : "+ notaFinal());
    }

    public static void main(String[] args) {
        Alumno a1=new Alumno();
        a1.setDni("55555555p");
        a1.setEdad(18);
        a1.setNotaT1(3);
        a1.setNotaT2(2);
        a1.setNotaT3(4);
        System.out.println(a1);

        Alumno a2=new Alumno();
        a2.setDni("41234569l");
        a2.setEdad(13);
        a2.setNotaT1(5);
        a2.setNotaT2(8);
        a2.setNotaT3(8);
        System.out.println(a2);
    }
}
