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
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    public void Insertar(Node r){
        if(root == null)root = new Node(r.sexo,r.nombre);
        Node a = encontrar(root, r.hijo);
        if(a == root){
            System.out.println("No se pudo encontrar relacion familiar");
        }
        if(r.sexo == 'H')a.der = r;
            a.izq = r;
    }
    
    private Node encontrar(Node r,String n){
        if(r.nombre.equals(n))return r;
        if(r.izq == null && r.der == null)return root;
        encontrar(r.der, n);  
        encontrar(r.izq, n);
        return r;
    }
    
    public boolean buscar(String n){
        if(root.nombre.equals(n))return true;
        Node a = encontrar(root, n);
        if(a == root)return false;
        return true;
    }
        
    public void imprimir(){
        print(root);
    }
    
    private void print(Node root){
        if(root != null){
            System.out.println(root.nombre);
            print(root.izq);
            print(root.der);
        }
    }
    
    public void altura(){
        System.out.println(auxalt(root));
    }
    
    private int auxalt(Node root){
        if(root == null)return 0;
        int izq = auxalt(root.izq) + 1;
        int der = auxalt(root.der) + 1;
        return Math.max(izq, der);
    }
    
    public void abuelaMaterna(Node r){
        System.out.println(r.izq.izq.nombre);
    }
}
