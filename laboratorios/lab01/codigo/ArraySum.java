import java.util.Random;

public class ArraySum {

    public static void main(String[]args) {
        int size = 10000000;
        int max = 5000;
        int[] arr = new int[size];
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = generator.nextInt(max);
        }
		//int [] arr2 = {2,4,5,6,8}; 
        System.out.println(acum(arr, size-1));
    }

    static int acum(int[] arr, int n) {
        int total;
        if (n == 0) {
            return arr[0];
			
        } else {
			total = arr[n] + acum(arr, n -1);
        }
		
		return total;
    }
}