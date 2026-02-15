/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


// Clase que implementa una pila de bicicletas
public class PilaBicicletas {

    private Bicicleta[] pila;
    private int tope;

    // Constructor
    public PilaBicicletas(int tamanio) {
        pila = new Bicicleta[tamanio];
        tope = -1;
    }

    // Push: insertar bicicleta en la pila
    public boolean push(Bicicleta bicicleta) {
        if (tope < pila.length - 1) {
            tope++;
            pila[tope] = bicicleta;
            return true;
        }
        return false;
    }

    // Pop: eliminar bicicleta de la pila
    public Bicicleta pop() {
        if (tope >= 0) {
            Bicicleta bici = pila[tope];
            pila[tope] = null;
            tope--;
            return bici;
        }
        return null;
    }

    // Ver bicicleta del tope sin eliminar
    public Bicicleta peek() {
        if (tope >= 0) {
            return pila[tope];
        }
        return null;
    }

    // Verificar si la pila esta vacia
    public boolean estaVacia() {
        return tope == -1;
    }

    // Obtener cantidad de elementos
    public int tamanio() {
        return tope + 1;
    }
}

