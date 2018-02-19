public class recursion1 {

    public static void main(String[] args) {
    }

    public static int fibonacci(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else if (n == 1) {
            return 1;
        }
        return 0;
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies > 1) {
            return 2 + bunnyEars(bunnies - 1);
        } else if (bunnies == 1) {
            return 2;
        }
        return 0;
    }

    public static int powerN(int n, int base) {
        if (n == 1) {
            return base;
        }
        return base * powerN(n - 1, base);
    }

    public int triangle(int lados) {
        if (lados == 0) {
            return 0;
        }
        return lados + triangle(lados - 1);
    }
}
