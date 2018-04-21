/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

/**
 *
 * @author sloaizac
 */
public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }
    
    public void insertar(int n){
        root = auxInsertar(root, n);
    }
    
    public boolean buscar(int n){
        return auxBuscar(root, n);
    }
    
    private Node auxInsertar(Node root, int n){
        if(root == null)return new Node(n);
        if(n <= root.data) root.left = auxInsertar(root.left, n);
        if(n > root.data) root.rigth = auxInsertar(root.rigth, n);
        return root;
    }
    
    private boolean auxBuscar(Node root, int n){
        if(root.data == n) return true;
        if(root != null){
            if(root.data < n){
                root = root.left;
            }else{
                root = root.rigth;
            }
            auxBuscar(root, n);
        }
        return false;
    }
    
}
