package ud05.actividades.Recuperacion1;

public class Motocicleta {
    private int cv ;
    private int velocidad;
    private String matricula;

    public Motocicleta() {
        this(0,0,"");
    }

    public Motocicleta(int cv, int velocidad, String matricula) {
        this.cv = cv;
        this.velocidad = velocidad;
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String mostrarMatricula(){
        return matricula;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cv=" + cv +
                ", velocidad=" + velocidad +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Motocicleta m1 = new Motocicleta();

        m1.setCv(12);
        m1.setVelocidad(234);
        m1.setMatricula("444555");

        System.out.println(m1);

        Motocicleta m2 = new Motocicleta();
        m2.setCv(12);
        m2.setVelocidad(234);
        m2.setMatricula("444555");
        System.out.println(m2);
    }
}
