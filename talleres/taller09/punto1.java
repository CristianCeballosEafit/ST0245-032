/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller09;

/**
 *
 * @author sloaizac
 */

 public class punto1 {

    public  static  void  main ( String [] args ) {

    }
        // Ojo, esta tabla no se puede manejar manejar las colisiones
    private  int [] tabla;
    public  punto1 () {
        tabla =  new  int [ 10 ];
    }

    // Ojo, esta función hash es muy ingenua
    private  int  funcionHash ( String  k ) {
        return (( int ) k . charAt ( 0 )) %  10 ;
    }

    // Ojo con las colisiones
    public  int  get ( String  k ) {
        int x = funcionHash (k);
        return tabla[x];
    }

    // Ojo con las colisiones
    public  void  put ( String  k , int  v ) {
        int x = funcionHash (k);
        tabla [x] = v;
    }

}
