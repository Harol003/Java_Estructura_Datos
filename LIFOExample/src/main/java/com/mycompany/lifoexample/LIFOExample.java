/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lifoexample;

/**
 *
 * @author Harol
 */
import java.util.Stack;

public class LIFOExample {

    public static void main(String[] args) {
        // Crear una instancia de Stack para implementar LIFO
        Stack<String> lifoStack = new Stack<>();

        // Agregar elementos a la pila
        lifoStack.push("Elemento 1");
        lifoStack.push("Elemento 2");
        lifoStack.push("Elemento 3");
        
        System.out.println("| Politecnico Internacional | LIFO|");

        // Imprimir la pila actual
        System.out.println("Pila después de agregar elementos: " + lifoStack);

        // Retirar y mostrar el elemento superior de la pila
        String topElement = lifoStack.pop();
        System.out.println("Elemento retirado de la pila: " + topElement);

        // Imprimir la pila después de retirar un elemento
        System.out.println("Pila después de retirar un elemento: " + lifoStack);
    }
}
