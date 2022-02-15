package ud05.actividades.ejercicios1;

public class Motocicleta {
    private int cv;
    private int kmHora;
    private String letrasMatricula;
    private String numeroMatricula;

    public Motocicleta() {
        this(0, 0,"","");
    }

    public Motocicleta(int cv, int kmHora, String letrasMatricula, String numeroMatricula) {
        this.cv = cv;
        this.kmHora = kmHora;
        this.letrasMatricula = letrasMatricula;
        this.numeroMatricula = numeroMatricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getKmHora() {
        return kmHora;
    }

    public void setKmHora(int kmHora) {
        this.kmHora = kmHora;
    }

    public String getLetrasMatricula() {
        return letrasMatricula;
    }

    public void setLetrasMatricula(String letrasMatricula) {
        this.letrasMatricula = letrasMatricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String mostrarMatricula(){
        return numeroMatricula+letrasMatricula;
    }
    public String toString(){
        return String.format("\nMatricula:"+mostrarMatricula()+"\nKmh :"+ kmHora+"\nCaballos :"+cv);
    }


    public static void main(String[] args) {
        Motocicleta m1 =new Motocicleta();

        m1.setCv(299);
        m1.setKmHora(400);
        m1.setNumeroMatricula("333");
        m1.setLetrasMatricula("GHT");
        System.out.println(m1);

        Motocicleta m2=new Motocicleta();
        m2.setCv(100);
        m2.setKmHora(200);
        m2.setNumeroMatricula("222");
        m2.setLetrasMatricula("ABC");
        System.out.println(m2);

    }
}
