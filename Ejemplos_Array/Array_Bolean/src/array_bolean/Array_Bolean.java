/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_bolean;

/**
 *
 * @author Harol
 */
public class Array_Bolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declaracion y creacion de un array de valores booleanos
        boolean[] flags = {true, false, true, false, true};

        // Iterar sobre el array y mostrar los elementos
        System.out.println("Elementos del array de boolean:");
        for (int i = 0; i < flags.length; i++) {
            System.out.println("Elemento en la posicion " + i + ": " + flags[i]);
        }
    }
    
}
