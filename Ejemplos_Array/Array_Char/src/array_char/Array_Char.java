/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_char;

/**
 *
 * @author Harol
 */
public class Array_Char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declaracion y creacion de un array de caracteres
        char[] letters = {'A', 'B', 'C', 'D', 'E'};

        // Iterar sobre el array y mostrar los elementos
        System.out.println("Elementos del array de char:");
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Elemento en la posicion " + i + ": " + letters[i]);
        }
    }
    
}
