package taller2;

public class Euclides {

    public static void main(String[] args) {
        int x = 345;
        int y = 150;

        System.out.println(mcd(x, y));
    }

    public static int mcd(int x, int y) {
        if (y == 0) {
            return x;

        } else {
            return mcd(y, x % y);
        }
    }
}
