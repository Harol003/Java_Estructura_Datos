/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Implementacion de una pila usando apuntadores (LIFO)
public class PilaEnlazadaBicicletas {

    private Nodo tope; // Apunta al ultimo elemento insertado

    // Constructor
    public PilaEnlazadaBicicletas() {
        tope = null; // Pila vacia
    }

    // Push: insertar bicicleta en el tope
    public void push(Bicicleta bici) {
        Nodo nuevo = new Nodo(bici);
        nuevo.siguiente = tope; // Apunta al nodo anterior
        tope = nuevo;           // Mover apuntador al nuevo tope
    }

    // Pop: retirar bicicleta del tope
    public Bicicleta pop() {
        if (tope == null) {
            return null;
        }
        Bicicleta bici = tope.dato;
        tope = tope.siguiente; // Mover apuntador
        return bici;
    }

    // Peek: ver bicicleta del tope sin eliminar
    public Bicicleta peek() {
        if (tope != null) {
            return tope.dato;
        }
        return null;
    }

    // Verificar si la pila esta vacia
    public boolean estaVacia() {
        return tope == null;
    }

    // Mostrar pila completa
    public void mostrar() {
        Nodo actual = tope;

        if (actual == null) {
            System.out.println("Pila vacia");
            return;
        }

        System.out.println("Bicicletas en la pila (desde el tope):");
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
