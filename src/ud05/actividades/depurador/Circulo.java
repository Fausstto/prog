package ud05.actividades.depurador;




    public class Circulo {
        private String color;
        private double radio;

        public Circulo() {
            this("rojo",1.0);
        }

        public Circulo(double radio) {
            this("rojo",radio);
        }

        public Circulo(String color, double radio) {
            this.color = color;
            this.radio = radio;
        }

        public Circulo(Circulo unCirculo){
            this(unCirculo.getColor(),unCirculo.getRadio());
        }
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }

        @Override
        public String toString() {
            return "Circulo{" +
                    "color='" + color + '\'' +
                    ", radio=" + radio +
                    '}';
        }

        public double getArea(){
            return radio*radio*Math.PI;
        }

        public static void main(String[] args) {
            Circulo c1 = new Circulo("verde",5.0);
            System.out.println(c1);
            double a =  c1.getArea();
        }
    }

