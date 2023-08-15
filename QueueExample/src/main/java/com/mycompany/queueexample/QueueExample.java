/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queueexample;

/**
 *
 * @author Harol
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Crear una instancia de Queue utilizando LinkedList
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.offer("Elemento 1");
        cola.offer("Elemento 2");
        cola.offer("Elemento 3");

        // Mostrar la cola actual
        System.out.println("Cola después de agregar elementos: " + cola);

        // Retirar y mostrar el primer elemento de la cola
        String primerElemento = cola.poll();
        System.out.println("Primer elemento retirado de la cola: " + primerElemento);

        // Mostrar la cola después de retirar un elemento
        System.out.println("Cola después de retirar un elemento: " + cola);
    }
}
