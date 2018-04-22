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
public class Node {
    public Node der;
    public Node izq;
    public String hijo;
    public char sexo; // Hombre 'H', Mujer 'M'
    public String nombre;

    public Node(char sexo, String nombre) {
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public Node(String nombre, char sexo, String hijo) {
        this.hijo = hijo;
        this.sexo = sexo;
        this.nombre = nombre;
    }
    
    
    
}
