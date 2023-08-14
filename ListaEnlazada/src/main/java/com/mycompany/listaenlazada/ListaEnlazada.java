/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaenlazada;

/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023


// Definición de la clase para la Lista Enlazada
public class ListaEnlazada {

    // Clase interna para representar los nodos de la lista
    private class Nodo {
        int valor;       // Valor del nodo
        Nodo siguiente;  // Referencia al siguiente nodo

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    private Nodo cabeza; // Puntero al primer nodo en la lista

    // Constructor para inicializar la lista enlazada
    public ListaEnlazada() {
        cabeza = null;
    }

    // Método para agregar un valor al principio de la lista
    public void agregarAlPrincipio(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    // Método para imprimir los valores de la lista
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Crear una lista enlazada
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar valores al principio de la lista
        lista.agregarAlPrincipio(3);
        lista.agregarAlPrincipio(2);
        lista.agregarAlPrincipio(1);

        // Imprimir la lista
        System.out.print("|Politecnico Internacional | Lista enlazada |");
        System.out.print("Lista enlazada: ");
        lista.imprimirLista();
    }
}
