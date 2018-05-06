//https://github.com/ilabradors

import java.util.ArrayList;
import javafx.util.Pair;
import java.util.LinkedList;
import java.util.List;

// * Esta clase es una implementación de un digrafo usando listas de adyacencia

 
public class DiagraphAL extends Graph {

    LinkedList<LinkedList<Pair<Integer, Integer>>> listas;

    public DiagraphAL(int valor, int size) {
        super(valor);
        listas = new LinkedList<LinkedList<Pair<Integer, Integer>>>();
        for (int i = 0; i < size; i++) {
            listas.add(new LinkedList<Pair<Integer, Integer>>());
        }
    }
    public void addArc(int source, int destination, int weight) {
        listas.get(source).add(new Pair(destination, weight));
    }

    public int getWeight(int source, int destination) {
        LinkedList<Pair<Integer, Integer>> listaQueVaALaDerecha = listas.get(source);
        for (Pair<Integer, Integer> pareja : listaQueVaALaDerecha) {
            if (pareja.getKey() == destination) {
                return pareja.getValue();
            }
        }
        return 0;
    }

    public ArrayList<Integer> getSuccessors(int vertice) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (Pair<Integer, Integer> pareja : listas.get(vertice)) {
            if (pareja.getKey() != null && pareja.getValue() != 0) {
                ans.add(pareja.getKey());
            }
        }
        return ans;
    }

}
