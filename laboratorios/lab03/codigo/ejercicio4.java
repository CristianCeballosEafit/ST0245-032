package laboratorio3;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Stack numNeveras = new Stack();
        for (int k = 0; k <= 40; k++) {
            numNeveras.push(k);
            if (numNeveras.size() <= 0) {
                System.out.println("Ya no hay nada");
            }
        }
        ejercicio4(numNeveras);
    }

    public static void ejercicio4(Stack numNeveras) {
        Scanner scan = new Scanner(System.in);
        int i = 0;

        while (numNeveras.size() > 0) {
            i = i + 1;
            System.out.println("Solicitud numero: " + i);
            //System.out.println("______________________________________");
            System.out.print("Numero de neveras que quiere retiras: ");
            int retiro = scan.nextInt();

            if (retiro > numNeveras.size()) {
                System.out.println("No tenemos tal cantidad de neveras");
            } else if (numNeveras.size()<= 0) {
                System.out.println("Esa fue la última nevera");
            } else {
                for (int j = 0; j <= retiro - 1; j++) {
                    numNeveras.pop();
                }
            }
            System.out.println("Quedan: " + numNeveras.size() + " neveras");
            System.out.println("****************************************");
        }
    }
}
