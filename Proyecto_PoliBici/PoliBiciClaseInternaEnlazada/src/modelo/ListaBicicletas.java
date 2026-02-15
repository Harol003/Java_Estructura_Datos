/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */

// Modelo que implementa una lista simplemente enlazada
public class ListaBicicletas {

    // Clase interna Nodo
    private class Nodo {
        Bicicleta bicicleta;
        Nodo siguiente;

        Nodo(Bicicleta bicicleta) {
            this.bicicleta = bicicleta;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;
    private int tamanio;

    // Constructor
    public ListaBicicletas() {
        cabeza = null;
        tamanio = 0;
    }

    // Insertar bicicleta al final de la lista
    public void insertar(Bicicleta bicicleta) {
        Nodo nuevo = new Nodo(bicicleta);

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

    // Eliminar bicicleta por posicion
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

    // Obtener bicicleta por posicion
    public Bicicleta obtener(int posicion) {
        if (posicion < 0 || posicion >= tamanio) {
            return null;
        }

        Nodo actual = cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }
        return actual.bicicleta;
    }

    // Buscar bicicleta por codigo
    public Bicicleta buscar(int codigo) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.bicicleta.getCodigo() == codigo) {
                return actual.bicicleta;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Retornar tamanio de la lista
    public int longitud() {
        return tamanio;
    }

    // Verificar si la lista esta vacia
    public boolean estaVacia() {
        return tamanio == 0;
    }
}
