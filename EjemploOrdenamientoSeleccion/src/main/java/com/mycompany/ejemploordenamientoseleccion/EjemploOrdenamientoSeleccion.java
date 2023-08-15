/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploordenamientoseleccion;

/**
 *
 * @author Harol
 */
public class EjemploOrdenamientoSeleccion {

    public static void main(String[] args) {
        int[] arreglo = {5, 2, 8, 1, 3};

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        ordenarSeleccion(arreglo);

        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    // Implementación del método de ordenamiento por selección
    public static void ordenarSeleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambiar el elemento actual con el elemento mínimo
            int temp = arr[i];
            arr[i] = arr[indiceMinimo];
            arr[indiceMinimo] = temp;
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

