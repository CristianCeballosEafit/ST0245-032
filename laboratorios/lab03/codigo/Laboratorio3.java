package laboratorio3;
import java.util.ArrayList;
import java.util.List;

public class Laboratorio3 {

    public static void main(String[] args) {
        List l = new ArrayList();
        for (int i = 1; i <= 4; i++){
            l.add(i);
        }
        System.out.println(punto1(l));
    }

    public static int punto1(List<Integer> l) {
        int c =1;
        for (int i = 0; i <= l.size()-1; i++) {
            c = c * l.get(i);
        }
        return c;
    }
}
