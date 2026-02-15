/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Clase que implementa una lista enlazada generica
public class ListaGenerica<T> {

    // Clase interna Nodo generico
    private class Nodo {
        T dato;
        Nodo siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;
    private int tamanio;

    // Constructor
    public ListaGenerica() {
        cabeza = null;
        tamanio = 0;
    }

    // Insertar elemento al final
    public void insertar(T dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamanio++;
    }

    // Eliminar elemento por posicion
    public boolean eliminar(int posicion) {
        if (posicion < 0 || posicion >= tamanio) {
            return false;
        }

        if (posicion == 0) {
            cabeza = cabeza.siguiente;
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
        }
        tamanio--;
        return true;
    }

    // Obtener elemento por posicion
    public T obtener(int posicion) {
        if (posicion < 0 || posicion >= tamanio) {
            return null;
        }

        Nodo actual = cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    // Buscar elemento (usa equals)
    public T buscar(T dato) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Retornar tamanio
    public int longitud() {
        return tamanio;
    }

    // Verificar si esta vacia
    public boolean estaVacia() {
        return tamanio == 0;
    }
}
