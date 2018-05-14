package proyecto;

import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Original sacado de: AbhijeetMajumdar(2015) QuadTree
 * (Version1),https://gist.github.com/AbhijeetMajumdar/c7b4f10df1b87f974ef4
 * Modificado por: Sebastian Loaiza
 */
public class QuadTree {

    final int MAX_LEVEL = 5;
    int nivel = 0;
    List<Nodo> nodos;
    QuadTree padre;
    QuadTree NW = null;
    QuadTree NE = null;
    QuadTree SW = null;
    QuadTree SE = null;
    Frontera frontera;

    public static List<String> choques = new ArrayList<String>();
    public static List<Collision> colisioncitas = new ArrayList<Collision>();

    QuadTree(int nivel, Frontera frontera, QuadTree padre) {

        this.nivel = nivel;
        this.frontera = frontera;
        this.padre = padre;
        nodos = new CopyOnWriteArrayList<Nodo>();
    }

    public List<String> calcular(QuadTree tree) {
        List<String> result = null;
        if (tree == null) {
            return null;
        }

        if (tree.nivel == MAX_LEVEL) {
            if (tree.nodos.size() < 2) {
                return null;
            } else {
                result = calcdis(nodos);
            }
            System.out.println();
        }
        calcular(tree.NW);
        calcular(tree.NE);
        calcular(tree.SW);
        calcular(tree.SE);
        return result;
    }

    public void insert(double x, double y, int valor) {

        if (this.frontera.inRange(x, y) == false) {
            return;
        }

        Nodo nodo = new Nodo(x, y, valor);

        nodos.add(nodo);

        if (NW == null) {
            split();
        }

        if (this.nivel == MAX_LEVEL) {
            return;
        }

        if (this.NW.frontera.inRange(x, y)) {
            this.NW.insert(x, y, valor);
        }

        if (this.NE.frontera.inRange(x, y)) {
            this.NE.insert(x, y, valor);
        }

        if (this.SW.frontera.inRange(x, y)) {
            this.SW.insert(x, y, valor);
        }

        if (this.SE.frontera.inRange(x, y)) {
            this.SE.insert(x, y, valor);
        }
    }

    public List<String> ultcalc(QuadTree Q) {
        return calcdis(Q.nodos);
    }

    private void split() {
        double xOffset = this.frontera.xMin
                + (this.frontera.xMax - this.frontera.xMin) / 2;

        double yOffset = this.frontera.yMin
                + (this.frontera.yMax - this.frontera.yMin) / 2;

        NW = new QuadTree(this.nivel + 1, new Frontera(this.frontera.xMin,
                this.frontera.yMin, xOffset, yOffset), this);

        NE = new QuadTree(this.nivel + 1, new Frontera(xOffset, this.frontera.yMin,
                this.frontera.xMax, yOffset), this);

        SW = new QuadTree(this.nivel + 1, new Frontera(this.frontera.xMin, yOffset,
                xOffset, this.frontera.yMax), this);

        SE = new QuadTree(this.nivel + 1, new Frontera(xOffset, yOffset,
                this.frontera.xMax, this.frontera.yMax), this);
    }

    private List<String> calcdis(List<Nodo> nodos) {
        List<Collision> colllsions = new ArrayList<>();
        List<String> choques = new ArrayList<>();

        double d, x, y;
        for (Nodo n : nodos) {
            for (Nodo n2 : nodos) {
                if (n == n2) {
                    continue;
                }

                x = (Math.pow((n.x - n2.x), 2));
                y = (Math.pow((n.y - n2.y), 2));

                d = Math.sqrt(x + y);

                if (d <= 0.1) {
                    colllsions.add(new Collision(new Bee(n.x, n.y), new Bee(n2.x, n2.y)));
                    System.out.print(d + " ");
                    System.out.printf("%d y %d Pueden colisionar ", n.value, n2.value);
                    choques.add(MessageFormat.format("{0} y {1} Pueden colisionar", n.value, n2.value));
                    QuadTree.choques.add(MessageFormat.format("Abejas: {0}y{1} Pueden colisionar en {3} {4} ", n.value, n2.value, ("x1: " + n.x + "y1: " + n.y), ("x2:" + n2.x + "y2:" + n2.y)));
                    QuadTree.colisioncitas.add(new Collision(new Bee(n.x, n.y), new Bee(n2.x, n2.y)));
                    System.out.println("Coordenadas de la abeja: " + "x: " + n.x + " y: " + n.y);
                    System.out.println("Coordenadas de la abeja: " + "x2: " + n2.x + " y2: " + n2.y);
                    System.out.println();
                }
            }
            if (this.nivel >= 1) {
                dfs(n);
            }
            nodos.remove(n);
        }
        return choques;
    }

    private void dfs(Nodo nodo) {
        double LX, lx, LY, ly;
        LX = 8399.2;
        lx = 8388.1;
        LY = 707.7;
        ly = 699.9;
        if ((nodo.x + 0.1) > this.frontera.xMax
                && (nodo.x + 0.1) < LX) {
            return;
        }

        if ((nodo.x - 0.1) < this.frontera.xMin
                && (nodo.x + 0.1) > lx) {
            return;
        }

        if ((nodo.y + 0.1) > this.frontera.yMax
                && (nodo.x + 0.1) < LY) {
            return;
        }

        if ((nodo.y + 0.1) < this.frontera.yMin
                && (nodo.y + 0.1) > ly) {
            return;
        }

        this.padre.nodos.remove(nodo);

    }

}
