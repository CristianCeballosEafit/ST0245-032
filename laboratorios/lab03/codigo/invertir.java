package laboratorio3;

import java.util.LinkedList;
import java.util.Stack;

public class invertir {

    public static LinkedList<String> invertir(LinkedList<String> lista) {
        Stack<String> auxiliar = new Stack<String>();
        while ( lista.size() > 0){
 auxiliar.push(lista.removeFirst());
        }
        while (auxiliar.size() > 0) {
            lista.add(auxiliar.pop());
        }
        return lista;
    }

}
