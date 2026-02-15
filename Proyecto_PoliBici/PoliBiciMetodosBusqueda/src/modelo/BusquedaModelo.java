/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


public class BusquedaModelo {

    // Busqueda secuencial
    public int busquedaSecuencial(int[] datos, int valor) {

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // Busqueda binaria (arreglo debe estar ordenado)
    public int busquedaBinaria(int[] datos, int valor) {

        int inicio = 0;
        int fin = datos.length - 1;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            if (datos[medio] == valor) {
                return medio;
            } else if (valor < datos[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;
    }
}
