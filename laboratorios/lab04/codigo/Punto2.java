/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author sloaizac
 */

public class Punto2 {
    Nodo root;

    public Punto2() {
        root = null;
    }
    
    public void insertar(int n){
        root = auxInsertar(root, n);
    }
    
    private Nodo auxInsertar(Nodo root, int n){
        if(root == null)return new Nodo(n);
        if(n <= root.data) root.left = auxInsertar(root.left, n);
        if(n > root.data) root.rigth = auxInsertar(root.rigth, n);
        return root;
    }
    
    public void imprimir(){
        print(root);
    }
    
    private void print(Nodo root){
        if(root != null){
            print(root.left);
            print(root.rigth);
            System.out.println(root.data);
        }
    }

    
}
