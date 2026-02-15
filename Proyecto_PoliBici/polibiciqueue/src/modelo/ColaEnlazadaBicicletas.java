/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Implementacion de una cola usando apuntadores (FIFO)
public class ColaEnlazadaBicicletas {

    private Nodo frente; // Apunta al primer elemento
    private Nodo fin;    // Apunta al ultimo elemento

    // Constructor
    public ColaEnlazadaBicicletas() {
        frente = null;
        fin = null;
    }

    // Enqueue: insertar bicicleta al final de la cola
    public void enqueue(Bicicleta bici) {
        Nodo nuevo = new Nodo(bici);

        if (fin == null) {
            // Cola vacia
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo; // Apuntar al nuevo nodo
            fin = nuevo;           // Mover apuntador fin
        }
    }

    // Dequeue: retirar bicicleta del frente
    public Bicicleta dequeue() {
        if (frente == null) {
            return null;
        }

        Bicicleta bici = frente.dato;
        frente = frente.siguiente; // Mover apuntador frente

        if (frente == null) {
            fin = null; // Cola queda vacia
        }

        return bici;
    }

    // Peek: ver bicicleta del frente sin eliminar
    public Bicicleta peek() {
        if (frente != null) {
            return frente.dato;
        }
        return null;
    }

    // Verificar si la cola esta vacia
    public boolean estaVacia() {
        return frente == null;
    }

    // Mostrar cola completa
    public void mostrar() {
        Nodo actual = frente;

        if (actual == null) {
            System.out.println("Cola vacia");
            return;
        }

        System.out.println("Bicicletas en la cola (orden FIFO):");
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}

