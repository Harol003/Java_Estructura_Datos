/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploarbolbplus;

/**
 *
 * @author Harol
 */
import java.util.ArrayList;
import java.util.List;

// Clase para representar un nodo en el árbol B+
class NodoBPlus {
    List<Integer> claves;
    List<NodoBPlus> hijos;
    boolean esHoja;

    public NodoBPlus() {
        claves = new ArrayList<>();
        hijos = new ArrayList<>();
        esHoja = false;
    }
}

// Clase principal para mostrar la estructura básica de un árbol B+
public class EjemploArbolBPlus {

    public static void main(String[] args) {
        // Crear un nodo raíz
        NodoBPlus raiz = new NodoBPlus();
        raiz.esHoja = true;
        raiz.claves.add(10);
        raiz.claves.add(20);
        raiz.claves.add(30);

        // Crear un nodo hoja
        NodoBPlus nodoHoja = new NodoBPlus();
        nodoHoja.esHoja = true;
        nodoHoja.claves.add(40);
        nodoHoja.claves.add(50);
        nodoHoja.claves.add(60);

        // Agregar el nodo hoja como hijo del nodo raíz
        raiz.hijos.add(nodoHoja);

        // Imprimir las claves del nodo raíz y el nodo hoja
        System.out.println("| Politecnico Internacional | Arbol B+ & B-|");
        System.out.println("Claves del Nodo Raíz: " + raiz.claves);
        System.out.println("Claves del Nodo Hoja: " + nodoHoja.claves);
    }
}
