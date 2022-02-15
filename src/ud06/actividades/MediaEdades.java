package ud06.actividades;

public class MediaEdades {
    public static void main(String[] args) {

        int suma=0;
        int x=0;
        for(int i=1;i<args.length;i+=2){
            int valor=Integer.parseInt(args[i]);
            suma+=valor;
            x++;
        }
        x=x/2;
        System.out.println(suma/x);
    }
}
