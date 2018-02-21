package taller5;

public class Taller5 {

    public static void main(String[] args) {
         long ahora = System.currentTimeMillis();
         //Aqui va el nombre del metodo a evaluar
          tablas(10);
          long deNuevo = System.currentTimeMillis();
       System.out.println(deNuevo-ahora);
       
//        int [] arreglo= {1,2,3,4,5};
//        System.out.println(sumArray(arreglo, 0));      

//        tablas(3);

//        int numero[] = {2, 5, 6, 1, 9};
//        ordenar(numero);
    }

    public static int sumArray(int[] arr, int n) {
        if (n == arr.length) {
            return 0;
        }
        return arr[n] + sumArray(arr, n + 1);
    }

    public static void tablas(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + "x" + j + ": " + j * i);
            }
        }
    }

    public static void ordenar(int num[]) {
        for (int i = 0; i < (num.length - 1); i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
    }
}
