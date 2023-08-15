/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploordenamientoburbuja;

/**
 *
 * @author Harol
 */
public class EjemploOrdenamientoBurbuja {

    public static void main(String[] args) {
        int[] arreglo = {5, 2, 8, 1, 3};

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        ordenarBurbuja(arreglo);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    // Implementación del método de ordenamiento Burbuja
    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método auxiliar para imprimir un arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
