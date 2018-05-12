/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodatos1;

/**
 *
 * @author sloaizac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frontera frontera = new Frontera(0, 0, 5000, 5000);
        QuadTree Q = new QuadTree(0, frontera);
        Q.insert(0, 2, 1);
        Q.insert(5, 10, 2);
        Q.insert(2600, 4900, 3);
        Q.insert(2600, 4900, 4);
        Q.insert(546, 675, 5);
        Q.insert(3654, 200, 6);
        Q.dfs(Q);
    }
    
}
