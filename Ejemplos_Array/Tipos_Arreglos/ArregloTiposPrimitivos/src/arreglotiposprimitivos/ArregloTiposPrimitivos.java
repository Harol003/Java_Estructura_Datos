/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglotiposprimitivos;

/**
 *
 * @author Harol
 */
public class ArregloTiposPrimitivos {
    public static void main(String[] args) {
       // Politécnico Internacional
        // Este programa muestra un ejemplo de un arreglo de objetos.
        
          // Imprimir encabezado
        System.out.println("Politecnico Internacional");


        // Declarar y asignar un arreglo de booleanos
        boolean[] valores = {true, false, true};

        // Imprimir los elementos del arreglo de booleanos
        System.out.println("Elementos del arreglo de tipos primitivos:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor en la posicion " + i + ": " + valores[i]);
        }

        // Mensaje de despedida
        System.out.println("Gracias por utilizar este software.");
    }
}

