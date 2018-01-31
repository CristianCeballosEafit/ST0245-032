package taller2;

public class combinaciones {

    public static void Punto3(String base, String s) {
        if (s.length() == 0) {
            System.out.print(base + " , ");
        } else {
            Punto3(base + s.charAt(0), s.substring(1));
            Punto3(base, s.substring(1));
        }

    }

    public static void main(String[] args) {
        Punto3(" ", "abc");
    }
}

