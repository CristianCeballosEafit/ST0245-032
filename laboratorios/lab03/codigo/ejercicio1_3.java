package laboratorio3;

import java.util.ArrayList;

public class ejercicio1_3 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        System.out.println(ejercicio1_3(arr));
    }
    
    public static int ejercicio1_3(ArrayList<Integer> arr) {
        int total = 0;
        int dif;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            total = total + arr.get(i);
        }
        int mitad = total / 2;
        for (int j = 0; j < arr.size(); j++) {
            sum = sum + arr.get(j);
            dif = mitad - sum;
            if (dif <= arr.get(j + 1)) {
                return j + 1;
            }
        }
        return 0;
    }

}
