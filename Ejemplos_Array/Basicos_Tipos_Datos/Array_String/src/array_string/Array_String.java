/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_string;

/**
 *
 * @author Harol
 */
public class Array_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declaracion y creacion de un array de cadenas de texto
        String[] words = {"Hola", "Mundo", "Java", "Array"};

        // Iterar sobre el array y mostrar los elementos
        System.out.println("Elementos del array de String:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Elemento en la posicion " + i + ": " + words[i]);
        }
    }
    
}
