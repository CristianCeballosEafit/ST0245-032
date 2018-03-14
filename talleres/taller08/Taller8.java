package taller8;

//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Taller8 {

    public static void main(String[] args) {
        //punto1();
        punto2();
    }

    public static void punto1() {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> newStack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //Aquí imprimimos la pila
        System.out.println(stack);

        newStack.push(stack.pop());
        newStack.push(stack.pop());
        newStack.push(stack.pop());
        System.out.println(newStack);
    }

    public static void punto2() {
        Queue<String> cola = new LinkedList<String>();
        cola.add("Juan");
        cola.add("Maria");
        cola.add("Pedro");

        while (cola.peek() != null) {
            System.out.println("Atendido a: " + cola.remove());
        }
    }
}

