package ud05.actividades.Recuperacion1;

public class Alumno {
    private int edad;
    private String dni;
    private int t1;
    private int t2;
    private int t3;

    public Alumno() {
        this(0,"",-1,-1,-1);
    }

    public Alumno(int edad, String dni, int t1, int t2, int t3) {
        this.edad = edad;
        this.dni = dni;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public int getT3() {
        return t3;
    }

    public void setT3(int t3) {
        this.t3 = t3;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "edad=" + edad +
                ", dni='" + dni + '\'' +
                ", t1=" + t1 +
                ", t2=" + t2 +
                ", t3=" + t3 +
                '}';
    }
    public int notaFinal(){
        if(t1==-1||t2==-1||t3==-1)
            return -1;
        else
            return (t1+t2+t3)/3;
    }
    public String informeAlumno(){
        return edad + dni +  t1 + t2 + t3 + notaFinal();
    }

    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.setDni("4444444T");
        a1.setEdad(14);
        System.out.println(a1.informeAlumno());
    }

}
