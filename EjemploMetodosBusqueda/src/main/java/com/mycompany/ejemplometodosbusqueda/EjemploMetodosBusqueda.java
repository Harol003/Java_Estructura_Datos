/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplometodosbusqueda;

/**
 *
 * @author Harol
 */
public class EjemploMetodosBusqueda {

    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        int elementoBuscado = 11;

        int posicionLineal = busquedaLineal(arreglo, elementoBuscado);
        int posicionBinaria = busquedaBinaria(arreglo, elementoBuscado);
        int posicionHash = busquedaHash(arreglo, elementoBuscado);

        if (posicionLineal != -1) {
            System.out.println("Búsqueda lineal: El elemento " + elementoBuscado + " está en la posición " + posicionLineal);
        } else {
            System.out.println("Búsqueda lineal: El elemento " + elementoBuscado + " no se encontró");
        }

        if (posicionBinaria != -1) {
            System.out.println("Búsqueda binaria: El elemento " + elementoBuscado + " está en la posición " + posicionBinaria);
        } else {
            System.out.println("Búsqueda binaria: El elemento " + elementoBuscado + " no se encontró");
        }

        if (posicionHash != -1) {
            System.out.println("Búsqueda de hash: El elemento " + elementoBuscado + " está en la posición " + posicionHash);
        } else {
            System.out.println("Búsqueda de hash: El elemento " + elementoBuscado + " no se encontró");
        }
    }

    // Implementación de búsqueda lineal
    public static int busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;
            }
        }
        return -1; // No se encontró el elemento
    }

    // Implementación de búsqueda binaria
    public static int busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (arr[medio] == objetivo) {
                return medio;
            }
            if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1; // No se encontró el elemento
    }

    // Implementación de búsqueda de hash (solo para fines ilustrativos)
    public static int busquedaHash(int[] arr, int objetivo) {
        // En este ejemplo simple, asumimos que el arreglo es una tabla hash
        // y que la función hash devuelve directamente el índice
        int indice = objetivo % arr.length;
        if (arr[indice] == objetivo) {
            return indice;
        } else {
            return -1; // No se encontró el elemento
        }
    }
}
