package taller3;
import java.util.Scanner;
public class tores {

    public static void main(String[] args) {
        Scanner jh = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n = jh.nextInt();
        System.out.println("Esta es la secuencia: ");
        System.out.println("***********************************");
        torres(n, 1, 2, 3);
    }

    public static void torres(int n, int torreA, int torreB, int torreC) {
        if (n > 0) {
            torres(n - 1, torreA, torreC, torreB);
            System.out.println(torreA + " -> " + torreC );
            torres(n - 1, torreC, torreB, torreA);
        }
        
    }
}
