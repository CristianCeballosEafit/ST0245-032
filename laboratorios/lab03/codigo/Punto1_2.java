/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author sloaizac
 */
import java.util.ArrayList;
import java.util.List;

public class Punto1_2 {
    
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        SmartInsert(l, 0);
    }

    public static void SmartInsert(List l, int data) {
        for (int i = 0; i < l.size(); i++) {
            if (l.contains(data)) {
            } else {
                l.add(data);
            }
        }
        System.out.println(l);
    }
}
