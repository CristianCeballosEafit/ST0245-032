/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author Black Knight
 */
public class Fecha {
    
   private byte dia;
   private byte mes;
   private String [] meses = {null,"enero","febrero","marzo","abril","mayo",
                              "junio","julio","agosto","septiembre","octubre",
                              "noviembre","diciembre"};
   private int año;

    public Fecha(byte dia, byte mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        
    }
    
    public static void main(String[] args) {
        
    }

    public byte getDia() {
        return dia;
    }

    public byte getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    
    public String toString(Fecha fecha) {
        return "Fecha{" + dia + " de " + meses[fecha.getMes()] + " de " + año + '}';
    }

    public String comparar(Fecha fecha1, Fecha fecha2){
        if(fecha1.getAño() == fecha2.getAño()){
            if(fecha1.getMes() == fecha2.getMes() && fecha1.getDia() == fecha2.getDia()){
                return fecha1.toString() + " es igual a " + fecha2.toString();
            }
        }
       return fecha1.toString() + " es igual a " + fecha2.toString();
    }
}
    

    
  
