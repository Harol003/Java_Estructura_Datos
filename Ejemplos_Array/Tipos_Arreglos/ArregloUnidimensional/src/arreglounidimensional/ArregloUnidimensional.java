/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglounidimensional;

/**
 *
 * @author Harol
 */
public class ArregloUnidimensional {
    public static void main(String[] args) {
        // Politécnico Internacional
        // Este programa muestra un ejemplo de un arreglo unidimensional.
        
         // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declarar y asignar un arreglo unidimensional de enteros
        int[] numeros = {10, 20, 30, 40, 50};

        // Imprimir los elementos del arreglo
        System.out.println("Elementos del arreglo unidimensional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posicion " + i + ": " + numeros[i]);
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");
    }
}