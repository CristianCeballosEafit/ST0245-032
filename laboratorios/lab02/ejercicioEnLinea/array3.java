package laboratorio2;

public class array3 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 3, 4};
        int b[] = {5, 6, 3};
        fix34(a);
        canBalance(a);
        linearIn(a, b);
    }

    public static int[] fix34(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int acum = 0;
            for (int j = 0; j < i; j++) {
                acum = acum + nums[j];
            }
            for (int j = i; j < nums.length; j++) {
                acum = acum - nums[j];
            }
            if (acum == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int inicio = 0;
        int salida = 0;
        while (inicio < inner.length && salida < outer.length) {
            if (outer[inicio] == inner[salida]) {
                salida++;
                inicio++;
            } else {
                salida++;
            }
        }
        return (inicio == inner.length);

        //tomado de: http://www.javaproblems.com/2013/11/java-array-3-linearin-codingbat-solution.html
        //           http://gregorulm.com/codingbat-java-array-3-part-i/
    }

    public static int countClumps(int[] nums) {
        int counter = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !flag) {
                flag = true;
                counter++;
            } else if (nums[i] != nums[i + 1]) {
                flag = false;
            }
        }
        return counter;

        //Autor: https://www.experts-exchange.com/questions/28963339/countClumps-challenge.html
        //gudii9
    }
}
