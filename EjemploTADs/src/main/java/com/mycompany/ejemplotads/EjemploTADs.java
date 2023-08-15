/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplotads;

/**
 *
 * @author Harol
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EjemploTADs {

    public static void main(String[] args) {
        // Ejemplo de una Lista
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        System.out.println("Lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Ejemplo de una Pila
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("\nPila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        // Ejemplo de una Cola
        Queue<Double> cola = new LinkedList<>();
        cola.offer(1.1);
        cola.offer(2.2);
        cola.offer(3.3);

        System.out.println("\nCola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
