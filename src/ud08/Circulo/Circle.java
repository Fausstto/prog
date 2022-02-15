package ud08.Circulo;

import javax.print.DocFlavor;

public class Circle {
    private double radio;
    private String color;
    public Circle() {
        this(1.0, "red");
    }

    public Circle(double radio) {
        this(radio,"red");
    }

    public Circle(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea(){
        return radio*radio*Math.PI;
    }
}
