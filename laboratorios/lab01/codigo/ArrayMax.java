import java.util.Random;

public class ArrayMax {

    public static void main(String[]args) {
        int size = 100000000;
        int max = 5000;
        int[] arr = new int[size];
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = generator.nextInt(max);
        }
		//int [] arr2 = {2,4,5,6,8};
        System.out.print(valmayor(arr, size-1 ,arr[arr.length-1]));
    }

    static int valmayor(int[] arraymax, int n,int mayor) {

        if (n == 0) {
            return mayor;
        } else {
            if (arraymax[n] > mayor) {
			mayor = arraymax[n];
            }
			return valmayor(arraymax,n-1,mayor);
        }

        //return mayor;
    }
}