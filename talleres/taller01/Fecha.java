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
   private int year;

    public Fecha(byte dia, byte mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = year;
        
    }
    
    public static void main(String[] args) {
        
    }

    public byte getDia() {
        return dia;
    }

    public byte getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }
    

    public static boolean comparar(Fecha fecha1, Fecha fecha2){
        if(fecha1.getYear == fecha2.getYear){
            if(fecha1.getMes == fecha2.getMes){
                if(fecha1.getDia == fecha2.getDia)return true;
            }
        }
        return false;
        
    }
}
    

    
  
