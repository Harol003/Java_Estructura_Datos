/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Nodo de la lista enlazada
// Contiene un dato y un apuntador al siguiente nodo
public class Nodo {

    public Bicicleta dato;
    public Nodo siguiente;

    // Constructor
    public Nodo(Bicicleta dato) {
        this.dato = dato;
        this.siguiente = null; // No apunta a nadie
    }
}
