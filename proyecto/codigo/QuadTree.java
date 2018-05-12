/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectodatos1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 *
 * @author 
 * Original sacado de:
 * AbhijeetMajumdar(2015) QuadTree (Version1),https://gist.github.com/AbhijeetMajumdar/c7b4f10df1b87f974ef4
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

    QuadTree(int nivel, Frontera frontera, QuadTree padre) {

        this.nivel = nivel;
        this.frontera = frontera;
        this.padre = padre;
        nodos = new CopyOnWriteArrayList <Nodo>();
    }

    public void calcular(QuadTree tree) {

        if (tree == null) {
            return;
        }
    
        if(tree.nivel == MAX_LEVEL){
            if (tree.nodos.size() < 2)return;
            else {
                calcdis(nodos);
            }
            System.out.println();
        }
            calcular(tree.NW);
            calcular(tree.NE);
            calcular(tree.SW);
            calcular(tree.SE);
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
        
        if (this.nivel == MAX_LEVEL)return;

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
    
    public void ultcalc(QuadTree Q){
        calcdis(Q.nodos);
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
    
    private void calcdis(List<Nodo> nodos){
        double d, x, y;
        for(Nodo n: nodos){
            for(Nodo n2: nodos){
              if(n == n2)continue;

                  x = (Math.pow((n.x-n2.x), 2));
                  y = (Math.pow((n.y-n2.y), 2));
         
              d = Math.sqrt(x+y);

              if(d <= 0.1){
                  System.out.print(d + " ");
                  System.out.printf("%d y %d Pueden colisionar", n.value, n2.value);
                  System.out.println();
              }
            }
            if(this.nivel >= 1)dfs(n);
            nodos.remove(n);
        }
    }
    
    private void dfs(Nodo nodo){
        double LX, lx, LY, ly;
        LX = 8399.2;
        lx = 8388.1;
        LY = 707.7;
        ly = 699.9;
        if((nodo.x + 0.1) > this.frontera.xMax &&
                (nodo.x + 0.1) < LX)return;
        
        if((nodo.x - 0.1) < this.frontera.xMin &&
                (nodo.x + 0.1) > lx)return;
        
        if((nodo.y + 0.1) > this.frontera.yMax &&
                (nodo.x + 0.1) < LY)return;
        
        if((nodo.y + 0.1) < this.frontera.yMin &&
                (nodo.y + 0.1) > ly)return;
        
        this.padre.nodos.remove(nodo);
        
    }
    
}
