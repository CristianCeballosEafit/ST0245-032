/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodatos1;

/**
 *
 * @author sloaizac
 */

import java.io.BufferedReader;
import java.io.*;

public class Main {


    
    public static void main(String[] args) {
        String linea, ruta, cx, cy;
        double x, y;
        int i = 0;
        FileReader fr;
        BufferedReader br; 
        Frontera frontera = new Frontera(8388.1, 699.9, 
                8399.2, 707.7);
        QuadTree Q = new QuadTree(0, frontera, null);
        try {
            ruta = "C:\\Users\\sloaizac\\Documents\\prueba10Abejas.txt";
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                int n = linea.indexOf(',');
                cx = linea.substring(0, n);
                cy = linea.substring(n + 1);
                x = Float.parseFloat(cx);
                y = Float.parseFloat(cy);
                y = Math.abs(y * 111.1);
                x = Math.abs(x * 111.1);
                Q.insert(x, y, i);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Problema al procesar el archivo");
        }
        Q.calcular(Q);
        Q.ultcalc(Q);
    }

}
