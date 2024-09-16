/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglodeobjetos;

/**
 *
 * @author Harol
 */
public class ArregloDeObjetos {
    public static void main(String[] args) {
        // Politécnico Internacional
        // Este programa muestra un ejemplo de un arreglo de objetos.
        
          // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declarar y asignar un arreglo de objetos de tipo String
        String[] nombres = {"Carlos", "Ana", "Luis"};

        // Imprimir los elementos del arreglo de objetos
        System.out.println("Elementos del arreglo de objetos:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre en la posicion " + i + ": " + nombres[i]);
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");
    }
}

