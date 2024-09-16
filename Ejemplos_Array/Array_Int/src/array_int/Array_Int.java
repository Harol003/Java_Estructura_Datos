/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_int;

/**
 *
 * @author Harol
 */
public class Array_Int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declaracion y creacion de un array de enteros
        int[] numbers = {1, 2, 3, 4, 5};

        // Iterar sobre el array y mostrar los elementos
        System.out.println("Elementos del array de enteros:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elemento en la posicion " + i + ": " + numbers[i]);
    }
    
}
}