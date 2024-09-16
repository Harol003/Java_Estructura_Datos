/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_float;

/**
 *
 * @author Harol
 */
public class Array_Float {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir encabezado
        System.out.println("Politecnico Internacional");

        // Declaracion y creacion de un array de numeros de coma flotante
        float[] decimals = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        // Iterar sobre el array y mostrar los elementos
        System.out.println("Elementos del array de float:");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println("Elemento en la posicion " + i + ": " + decimals[i]);
        }
    }
    
}
