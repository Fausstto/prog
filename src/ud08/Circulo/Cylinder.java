package ud08.Circulo;

public class Cylinder  extends Circle{
    private double heigth;

    public Cylinder(){
        super();
        this.heigth= 1.0;
    }
    public Cylinder(double heigth){
        super();
        this.heigth= heigth;
    }
    public  Cylinder(double heigth, double radio){
        super(radio);
        this.heigth= heigth;
    }
    public Cylinder (double heigth, double radio, String color){
        super(1.0, "red");
        this.heigth= heigth;
    }
}
