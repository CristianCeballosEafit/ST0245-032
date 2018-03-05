package laboratorio2;

import java.util.Arrays;

public class array2 {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5, 6, 13};
        countEvens(a);
        bigDiff(a);
        centeredAverage(a);
        sum13(a);
        has22(a);
    }

    public static int countEvens(int[] nums) {
        int acum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] % 2 == 0) {
                acum = acum + 1;
            }
        }
        return acum;
    }

    public static int bigDiff(int[] nums) {
        int mayor = nums[0];
        int menor = nums[0];
        for (int i = 0; i <= nums.length - 1; i++) {
            if (mayor < nums[i]) {
                mayor = nums[i];
            } else if (menor > nums[i]) {
                menor = nums[i];
            }
        }
        return mayor - menor;
    }

    public static int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
            count++;

        }
        return sum / count;

        //El método .sort ordena los elementos de un arreglo de acuerdo a su valor por defecto
        //solucion: http://www.javaproblems.com/2012/12/coding-bat-java-array-2-centeredaverage.html
        //Explicación del método .sort: https://developer.mozilla.org/es/docs/Web/JavaScript/Referencia/Objetos_globales/Array/sort
        //                              https://stackoverflow.com/questions/8938235/sort-an-array-in-java
        //                              https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != 13) {
                sum = sum + nums[i];
            } else if (nums[i] == 13 && i < nums.length - 1) {
                nums[i] = 0;
                nums[i + 1] = 0;

            }
        }
        return sum;
    }

    public static boolean has22(int[] nums) {
        int acum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 2 && i > 0 && nums[i - 1] == 2) {
                acum = acum + 1;
            }
            if (nums[i] == 2 && i < nums.length - 1 && nums[i + 1] == 2) {
                acum = acum + 1;
            }
        }
        if (acum == 2) {
            return true;
        }
        return false;
    }

}
