/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplolistaabstracta;

/**
 *
 * @author Harol
 */
// Politecnico Internacional
// Programacion I
// Prof. Harol Torres
// Harol.Torres@pi.edu.co
// Ciclo: 27 de Julio, 2023



// Definición de la interfaz para la Lista Abstracta
interface ListaAbstracta<E> {
    void agregar(E elemento);  // Método para agregar un elemento a la lista
    E obtener(int indice);     // Método para obtener un elemento en un índice específico
    int tamaño();              // Método para obtener el tamaño de la lista
}

// Implementación de la Lista Abstracta usando un arreglo
class ListaArreglo<E> implements ListaAbstracta<E> {
    private Object[] elementos; // Arreglo para almacenar los elementos
    private int tamaño;         // Variable para rastrear el tamaño actual

    public ListaArreglo(int capacidadInicial) {
        elementos = new Object[capacidadInicial];
        tamaño = 0;
    }

    @Override
    public void agregar(E elemento) {
        // Verificar si es necesario aumentar la capacidad del arreglo
        if (tamaño == elementos.length) {
            Object[] nuevoArreglo = new Object[elementos.length * 2];
            System.arraycopy(elementos, 0, nuevoArreglo, 0, tamaño);
            elementos = nuevoArreglo;
        }

        // Agregar el elemento al final de la lista
        elementos[tamaño] = elemento;
        tamaño++;
    }

    @Override
    public E obtener(int indice) {
        // Verificar si el índice está dentro de los límites
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites");
        }

        // Obtener el elemento en el índice especificado
        @SuppressWarnings("unchecked")
        E elemento = (E) elementos[indice];
        return elemento;
    }

    @Override
    public int tamaño() {
        return tamaño;
    }
}

public class EjemploListaAbstracta {
    public static void main(String[] args) {
        // Crear una lista abstracta implementada con arreglo
        ListaAbstracta<String> lista = new ListaArreglo<>(5);

        // Agregar elementos a la lista
        lista.agregar("Goku");
        lista.agregar("Vegeta");
        lista.agregar("Trunks");

        // Obtener y mostrar elementos
        System.out.println("|Politecnico Internacional | Ejemplo Lista Abstracta|");
        System.out.println("Personaje en índice 1: " + lista.obtener(1));
        System.out.println("Tamaño de la lista de personajes: " + lista.tamaño());
    }
}
