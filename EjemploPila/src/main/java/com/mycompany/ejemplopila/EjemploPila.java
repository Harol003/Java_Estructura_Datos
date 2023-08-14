/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplopila;

/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023


import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        // Crear una pila para números enteros
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila (operación "push")
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("|Politecnico Internacional | Ejemplo Pila Push Pop|");
        System.out.println("Pila después de agregar elementos: " + pila);

        // Retirar elementos de la pila (operación "pop")
        int elemento1 = pila.pop();
        int elemento2 = pila.pop();

        System.out.println("Elemento retirado: " + elemento1);
        System.out.println("Elemento retirado: " + elemento2);

        System.out.println("Pila después de retirar elementos: " + pila);
    }
}
