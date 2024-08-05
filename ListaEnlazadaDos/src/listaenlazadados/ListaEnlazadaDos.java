/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaenlazadados;

/**
 *
 * @author Harol
 */
// Definición de la clase principal ListaEnlazadaDos
public class ListaEnlazadaDos {

    // La clase Nodo es una clase interna que representa cada elemento (nodo) de la lista enlazada
    private class Nodo {
        int dato; // El valor almacenado en este nodo
        Nodo siguiente; // Referencia al siguiente nodo en la lista

        // Constructor de la clase Nodo
        // Toma un valor entero como parámetro y lo asigna al campo 'dato'
        // Inicializa 'siguiente' a null porque inicialmente no hay siguiente nodo
        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Referencia al primer nodo de la lista enlazada
    private Nodo cabeza;

    // Constructor de la clase ListaEnlazadaDos
    // Inicializa la lista enlazada vacía, por lo que 'cabeza' es null
    public ListaEnlazadaDos() {
        this.cabeza = null;
    }

    // Método para agregar un nuevo nodo al final de la lista enlazada
    // Toma un valor entero como parámetro
    public void agregar(int dato) {
        // Crear un nuevo nodo con el valor dado
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza de la lista
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            // Si la lista no está vacía, recorrer la lista hasta el último nodo
            Nodo actual = cabeza;
            // Bucle para encontrar el último nodo (nodo cuya referencia 'siguiente' es null)
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            // Establecer el nuevo nodo como el siguiente del último nodo encontrado
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para imprimir todos los elementos de la lista enlazada
    public void imprimir() {
        // Comenzar desde la cabeza de la lista
        Nodo actual = cabeza;
        // Recorrer cada nodo de la lista hasta llegar al final (null)
        while (actual != null) {
            // Imprimir el valor del nodo actual seguido de un espacio
            System.out.print(actual.dato + " ");
            // Moverse al siguiente nodo
            actual = actual.siguiente;
        }
        // Imprimir una nueva línea al final de la lista
        System.out.println();
    }

    // Método principal para probar la lista enlazada
    public static void main(String[] args) {
        // Crear una instancia de la clase ListaEnlazadaDos
        ListaEnlazadaDos lista = new ListaEnlazadaDos();

        // Agregar algunos elementos a la lista
        lista.agregar(1); // Agregar el número 1 a la lista
        lista.agregar(2); // Agregar el número 2 a la lista
        lista.agregar(3); // Agregar el número 3 a la lista

        // Imprimir los elementos de la lista
        lista.imprimir(); // Salida esperada: 1 2 3
    }
}
