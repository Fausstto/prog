package ud05.actividades.Recuperacion1.examentarde;

import java.util.Scanner;

public class Fecha {

    private int dia;
    private int mes;
    private int ano;

    public Fecha() {
        this(1,1,2019);
    }

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int setFecha (int ndia, int nmes, int nano){
        if(ndia>=1&&ndia<=30&&nmes>=1&&nmes<=12){
            this.dia=ndia;
            this.mes=nmes;
            this.ano=nano;
        }
        return ndia;
    }
    public void setFecha(String nuevaFecha){
        Scanner sc = new Scanner(System.in);
        nuevaFecha = sc.nextLine();
        int dia = Integer.parseInt(nuevaFecha.substring(0,2));
        int mes = Integer.parseInt(nuevaFecha.substring(3,5));
        int ano = Integer.parseInt(nuevaFecha.substring(6,10));
        setFecha(dia,mes,ano);
    }
    public String getFecha(){
        return dia + "/" +mes +"/"+ano;
    }
   /* public String periodo(Fecha juan){
      int nuevaFecha = setFecha(12,4,2021);
      if
    }*/
}
