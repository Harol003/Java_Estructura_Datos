/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayexample;

/**
 *
 * @author Harol
 */
public class ArrayExample {
    public static void main(String[] args) {
        
        // Declaración e inicialización de un arreglo
        int[] numeros = new int[5];

        // Asignación de valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acceso a elementos del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en Indice " + i + ": " + numeros[i]);
        }
    }
}