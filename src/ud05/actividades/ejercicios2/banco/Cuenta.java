package ud05.actividades.ejercicios2.banco;

import java.util.Random;
import java.util.Scanner;

public class Cuenta {
    /*private int numCuenta;
    private int saldo;
    private int contrasenia;
    private int contrasenia_introducida;

    public Cuenta(int numCuenta, int saldo, int contrasenia, int contrasenia_introducida) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.contrasenia = contrasenia;
        this.contrasenia_introducida = contrasenia_introducida;
    }

    public Cuenta() {
        this(0,0,0,0);
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;Aras
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta=" + numCuenta +
                ", saldo=" + saldo +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
    public void modificar_saldo(double cantidad){
        saldo+=cantidad;
    }
    public int generar_contrasenia(){
        Random rnd=new Random(contrasenia);
        return contrasenia=rnd.nextInt(1000)+9999;

    }
    public void modificar_contrasenia(){
        Scanner sc = new Scanner(System.in);
        Random rnd=new Random(contrasenia);
      do {
          System.out.println(contrasenia);
          System.out.println("Introduce tu contrasenia");
          contrasenia_introducida = sc.nextInt();
          if (contrasenia_introducida == contrasenia) {
              contrasenia = rnd.nextInt(1000) + 9999;
              System.out.println("nueva contrasenia" + contrasenia);
          } else {
              System.out.println("ERROR");
          }
      }while(contrasenia_introducida!=contrasenia);

    }
    public boolean validar_contrasenia(int contrasenia) {
        return (contrasenia >= 0 && contrasenia <= 9999);
    }
    public void mostrar_datos(int contrasenia){
        if(contrasenia==contrasenia_introducida){
            System.out.println( "numCuenta=" + numCuenta +
                    ", saldo=" + saldo +
                    ", contrasenia='" + contrasenia);
            
        }
    }
*/

}
