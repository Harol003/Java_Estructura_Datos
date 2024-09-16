/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglobidimensional;

/**
 *
 * @author Harol
 */
public class ArregloBidimensional {
    public static void main(String[] args) {
        // Politécnico Internacional
        // Este programa muestra un ejemplo de un arreglo bidimensional.
        
         // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declarar y asignar un arreglo bidimensional de enteros
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir los elementos del arreglo bidimensional
        System.out.println("Elementos del arreglo bidimensional:");
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas
                System.out.println("Elemento en la posicion [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");
    }
}
