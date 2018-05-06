
import java.util.ArrayList;
import java.util.Arrays;

//https://github.com/ilabradors
//Como dibujarlo
//http://cs.fit.edu/~ryan/java/programs/graph/Dijkstra-java.html
 
public class DiagraphAlgorithms {

    private static int minVerice(int[] distancia, boolean[] v) {
        int x = Integer.MAX_VALUE;
        int y = -1;   // No conectado
        for (int i = 0; i < distancia.length; i++) {
            if (!v[i] && distancia[i] < x) {
                y = i;
                x = distancia[i];
            }
        }
        return y;
    }

    static int[] dijsktra(Graph theGrafo, int source) {
        final int[] dist = new int[theGrafo.size()];  // shortest known distance from "s"
        final int[] pred = new int[theGrafo.size()];  // preceeding node in path
        final boolean[] visited = new boolean[theGrafo.size()]; // all false initially

        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE; //Infinity
        }
        dist[source] = 0;

        for (int i = 0; i < dist.length; i++) {
            final int next = minVerice(dist, visited);
            visited[next] = true;

            // The shortest path to next is dist[next] and via pred[next].
            final ArrayList<Integer> n = theGrafo.getSuccessors(next);
            for (int j = 0; j < n.size(); j++) {
                final int v = n.get(j);
                final int d = dist[next] + theGrafo.getWeight(next, v);
                if (dist[v] > d) {
                    dist[v] = d;
                    pred[v] = next;
                }
            }
        }
        return pred;
    }

    public static ArrayList getPath(int[] pred, int value, int e) {
        final java.util.ArrayList path = new java.util.ArrayList();
        int x = e;
        while (x != value) {
            path.add(0, x);
            x = pred[x];
        }
        path.add(0, value);
        return path;
    }

    // Código para dibujar el grafo en GraphViz
    // Recomiendo www.webgraphviz.com/
    public static void dibujarGrafo(Graph g) {
        System.out.println("El grafo {");
        System.out.println("nodo [color=cyan, style=filled];");
        int nv = g.size();
        for (int i = 0; i < nv; i++) {
            ArrayList<Integer> lista = g.getSuccessors(i);
            for (int j = 0; j < lista.size(); j++) {
                System.out.println("\"" + i + "\" -> \"" + lista.get(j) + "\" [ label=\"" + g.getWeight(i, lista.get(j)) + "\"];");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        DiagraphAL dgal = new DiagraphAL(5, 9);
        dgal.addArc(0, 1, 10);
        dgal.addArc(0, 2, 3);
        dgal.addArc(1, 2, 1);
        dgal.addArc(1, 3, 2);
        dgal.addArc(2, 1, 4);
        dgal.addArc(2, 3, 8);
        dgal.addArc(2, 4, 2);
        dgal.addArc(3, 4, 7);
        dgal.addArc(4, 3, 9);

        System.out.println(getPath(dijsktra(dgal, 0), 0, 3));
        DiagraphAlgorithms.dibujarGrafo(dgal);

        DiagraphAM dgam = new DiagraphAM(5);
        dgam.addArc(0, 1, 10);
        dgam.addArc(0, 2, 3);
        dgam.addArc(1, 2, 1);
        dgam.addArc(1, 3, 2);
        dgam.addArc(2, 1, 4);
        dgam.addArc(2, 3, 8);
        dgam.addArc(2, 4, 2);
        dgam.addArc(3, 4, 7);
        dgam.addArc(4, 3, 9);

        System.out.println(getPath(dijsktra(dgam, 0), 0, 3));

        DiagraphAlgorithms.dibujarGrafo(dgam);
    }

    //1.2 con AM
    public static int VerticeMasPopularAM(DiagraphAM m) {
        int max = 0;
        int maxIndex = -1;
        int actual = 0;
        for (int i = 0; i < m.size; i++) {
            actual = m.getSuccessors(i).size();
            if (actual > max) {
                max = actual;
                maxIndex = i;
            }
            actual = 0;
        }
        return maxIndex;
    }

    //1.2 con AL   
    public static int VerticeMasPopularAL(DiagraphAL m, int size) {
        int max = 0;
        int maxIndex = -1;
        int actual = 0;
        for (int i = 0; i < m.size; i++) {
            actual = m.getSuccessors(i).size();
            if (actual > max) {
                max = actual;
                maxIndex = i;
            }
            actual = 0;
        }
        return maxIndex;
    }
}
