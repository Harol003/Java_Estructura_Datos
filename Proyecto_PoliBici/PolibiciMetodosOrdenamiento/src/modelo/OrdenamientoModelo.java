/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */


public class OrdenamientoModelo {

    // Metodo burbuja
    public void burbuja(int[] datos) {

        for (int i = 0; i < datos.length - 1; i++) {
            for (int j = 0; j < datos.length - 1; j++) {

                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                }
            }
        }
    }
}
