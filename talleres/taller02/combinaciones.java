package taller2;

public class combinaciones {

    public static void prefijo(String base, String s) {
        if (s.length() == 0) {
            System.out.print(base + " , ");
        } else {
            prefijo(base + s.charAt(0), s.substring(1));
            prefijo(base, s.substring(1));
        }

    }

    public static void main(String[] args) {
        prefijo(" ", "abc");
    }
}

