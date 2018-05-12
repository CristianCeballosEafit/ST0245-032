/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectodatos1;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 
 * Original sacado de:
 * AbhijeetMajumdar(2015) QuadTree (Version1),https://gist.github.com/AbhijeetMajumdar/c7b4f10df1b87f974ef4
 * Modificado por: Sebastian Loaiza
 */

public class QuadTree {

    final int MAX_LEVEL = 7;
    int nivel = 0;
    List<Nodo> nodos;
    QuadTree NW = null;
    QuadTree NE = null;
    QuadTree SW = null;
    QuadTree SE = null;
    Frontera frontera;

    QuadTree(int nivel, Frontera frontera) {

        this.nivel = nivel;
        this.frontera = frontera;
        nodos = new ArrayList<>();
    }

    public void dfs(QuadTree tree) {

        if (tree == null) {
            return;
        }

        //imprimir caracteristicas de nodo...
        //System.out.printf("\nNivel = %d [X1=%d Y1=%d] \t[X2=%d Y2=%d]",
        // 		  tree.nivel, tree.frontera.xMin, tree.frontera.yMin,
        // 		  tree.frontera.xMax, tree.frontera.yMax);
        
        if(tree.nivel == MAX_LEVEL){
            if (tree.nodos.size() < 2)return;
            
            System.out.println("Los siguientes nodos puden colisionar entre sí...");
            for (Nodo nodo : tree.nodos) {
                //Recorrer coleccion de nodos...
                System.out.print(nodo.value + "-");
            }
            System.out.println();
        }
            dfs(tree.NW);
            dfs(tree.NE);
            dfs(tree.SW);
            dfs(tree.SE);
    }

  

    public void split() {
        int xOffset = this.frontera.xMin
                + (this.frontera.xMax - this.frontera.xMin) / 2;

        int yOffset = this.frontera.yMin
                + (this.frontera.yMax - this.frontera.yMin) / 2;

        NW = new QuadTree(this.nivel + 1, new Frontera(this.frontera.xMin,
                this.frontera.yMin, xOffset, yOffset));

        NE = new QuadTree(this.nivel + 1, new Frontera(xOffset, this.frontera.yMin,
                this.frontera.xMax, yOffset));

        SW = new QuadTree(this.nivel + 1, new Frontera(this.frontera.xMin, yOffset,
                xOffset, this.frontera.yMax));

        SE = new QuadTree(this.nivel + 1, new Frontera(xOffset, yOffset,
                this.frontera.xMax, this.frontera.yMax));
    }

    public void insert(int x, int y, int valor) {

        if (this.frontera.inRange(x, y) == false) {
            return;
        }

        Nodo nodo = new Nodo(x, y, valor);

        if (NW == null) {
            split();
        }
        
        if (this.nivel == MAX_LEVEL) {
            nodos.add(nodo);
            //System.out.println("Nodo agregado al nivel maximo...");
            return;
        }

        if (this.NW.frontera.inRange(x, y)) {
            nodos.add(nodo);
            //System.out.println("Nodo agregando a NW");
            this.NW.insert(x, y, valor);
        }

        if (this.NE.frontera.inRange(x, y)) {
            nodos.add(nodo);
            this.NE.insert(x, y, valor);
        }

        if (this.SW.frontera.inRange(x, y)) {
            nodos.add(nodo);
            this.SW.insert(x, y, valor);
        }

        if (this.SE.frontera.inRange(x, y)) {
            nodos.add(nodo);
            this.SE.insert(x, y, valor);
        }
    }
}
