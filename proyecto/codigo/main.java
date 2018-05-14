package proyecto;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    interfaz lista = new interfaz();

    public static List<String> popo() {
        List<String> result = null;
        System.out.print("Ejecución en milisegundos = ");
        System.out.println(System.currentTimeMillis());

//        long inicio = System.currentTimeMillis();
//        //Thread.sleep(1000);
//        long fin = System.currentTimeMillis();
//        double tiempo = (double) ((fin - inicio) / 1000);
//        System.out.println("Tiempo de ejecución: ");
//        System.out.println(tiempo + " segundos");
        String linea, ruta, cx, cy;
        double x, y;
        int i = 0;
        FileReader fr;
        BufferedReader br;
        Frontera frontera = new Frontera(8388.1, 699.9,
                8399.2, 707.7);
        QuadTree Q = new QuadTree(0, frontera, null);
        try {
            ruta = "D:\\Datos y algoritmos I\\coord.txt";
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
        result = Q.ultcalc(Q);

        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        main.popo();
    }
}
