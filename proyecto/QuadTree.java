import java.util.List;
import java.util.ArrayList;

public class QuadTree{
    
    final int MAX_CAP = 4;
    int nivel = 0;
    List<Nodo> nodos;
    QuadTree NW = null;
    QuadTree NE = null;
    QuadTree SW = null;
    QuadTree SE = null;
    Frontera frontera;

    QuadTree(int nivel, Frontera frontera){
	
	this.nivel = nivel;
	this.frontera = frontera;
	nodes = new ArrayList<Nodo>;
    }

    public static void dfs(QuadTree tree){
	
	if(tree == null)return;

	//imprimir caracteristicas de nodo...
	// System.out.printf("\nNivel = %d [X1=%d Y1=%d] \t[X2=%d Y2=%d]",
	// 		  tree.nivel, tree.frontera.getxMin, tree.frontera.getyMin,
	// 		  tree.frontera.getxMax, tree.frontera.getyMax);
	

	for(Nodo nodo : tree.nodos){
	    //Recorrer coleccion de nodos...
	    //System.out.printf("\n\t x=%d y=%", node.x, node.y);
	}

	if(tree.nodes.size() == 0){
	    //En caso de que no hayan nodos en el cuadrante...
	}

	dfs(tree.NW);
	dfs(tree.NE);
	dfs(tree.SW);
	dfs(tree.SE);
    }

    public void split(){
	int xOffset = this.frontera.xMin()
	    + (this.frontera.getxMax() - this.frontera.getxMin())/2;
	
	int yOffset = this.frontera.yMin()
	    + (this.frontera.getyMax() - this.frontera.getyMin())/2;

	NW = new QuadTree(this.nivel + 1, new Frontera(this.frontera.getxMin(),
						       this.boundry.getyMin(), xOffset, yOffset));

	NE = new QuadTree(this.nivel + 1, new Frontera(xOffset, this.frontera.getyMin(),
						       this.frontera.getxMax(), yOffset));


	SW = new QuadTree(this.nivel + 1, new Frontera(this.frontera.getxMin(), yOffset,
						       xOffset, this.frontera.getyMax()));

	SE = new QuadTree(this.nivel + 1, new Frontera(xOffset, yOffset,
						       this.frontera.getxMax(), this.frontera.getyMax()));
    }

    public void insert(int x, int y, int valor){

	if(!this.frontera.inRange(x, y))return;

	Nodo nodo = new Nodo(x, y, valor);

	if(nodos.size() < MAX_CAPACITY){

	    nodos.add(nodo);
	    return;
	}

	if(NW == null)split();

	if(this.NW.frontera.inRange(x ,y)){
	    this.NW.insert.(x, y, valor);
	}

	if(this.NE.frontera.inRange(x ,y)){
	    this.NE.insert.(x, y, valor);
	}	

	if(this.SW.frontera.inRange(x ,y)){
	    this.SW.insert.(x, y, valor);
	}

	if(this.SE.frontera.inRange(x ,y)){
	    this.SE.insert.(x, y, valor);
	}	
    }
}

