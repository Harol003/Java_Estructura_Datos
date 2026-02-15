/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Lista enlazada simple usando apuntadores
public class ListaEnlazadaBicicletas {

    private Nodo cabeza; // Apunta al primer nodo

    // Constructor
    public ListaEnlazadaBicicletas() {
        cabeza = null; // Lista vacia
    }

    // Insertar bicicleta al final
    public void insertar(Bicicleta bici) {
        Nodo nuevo = new Nodo(bici);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            // Recorrido usando apuntadores
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Eliminar bicicleta por marca
    public boolean eliminar(String marca) {
        if (cabeza == null) {
            return false;
        }

        // Si la bicicleta esta en la cabeza
        if (cabeza.dato.getMarca().equalsIgnoreCase(marca)) {
            cabeza = cabeza.siguiente; // Mover apuntador
            return true;
        }

        Nodo actual = cabeza;

        // Buscar usando apuntadores
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.getMarca().equalsIgnoreCase(marca)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    // Mostrar lista completa
    public void mostrar() {
        Nodo actual = cabeza;

        if (actual == null) {
            System.out.println("Lista vacia");
            return;
        }

        // Recorrer con apuntadores
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Buscar bicicleta por marca
    public Bicicleta buscar(String marca) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato.getMarca().equalsIgnoreCase(marca)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}
