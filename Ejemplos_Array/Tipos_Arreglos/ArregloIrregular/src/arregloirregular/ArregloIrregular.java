/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloirregular;

/**
 *
 * @author Harol
 */
public class ArregloIrregular {
    public static void main(String[] args) {
        // Politécnico Internacional
        // Este programa muestra un ejemplo de un arreglo irregular.
        // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declarar y asignar un arreglo irregular de enteros
        int[][] arregloIrregular = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };

        // Imprimir los elementos del arreglo irregular
        System.out.println("Elementos del arreglo irregular:");
        for (int i = 0; i < arregloIrregular.length; i++) { // Recorre las filas
            for (int j = 0; j < arregloIrregular[i].length; j++) { // Recorre las columnas
                System.out.println("Elemento en la posicion [" + i + "][" + j + "]: " + arregloIrregular[i][j]);
            }
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");
    }
}

