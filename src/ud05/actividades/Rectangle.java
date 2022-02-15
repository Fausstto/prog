package ud05.actividades;

public class Rectangle {
    private final float length;
    private final float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length=1.0f;
        this.width=1.0f;
    }


    public double getArea(){
        return length * width;
    }
    public  double getPerimeter(){
        return (length+width)*2;
    }
    public String toString(){
        return "Rectangle{"+"length="+length+",width="+width+"}";
    }
    public static void main(String[] args){
        Rectangle r1 =new Rectangle();
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        Rectangle r2 =new Rectangle(2,3);
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
