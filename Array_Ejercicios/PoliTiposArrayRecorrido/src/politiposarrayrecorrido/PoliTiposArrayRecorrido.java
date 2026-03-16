/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politiposarrayrecorrido;

/**
 *
 * @author Harol
 */
public class PoliTiposArrayRecorrido {

    public static void main(String[] args) {

        // Mensaje de bienvenida
        System.out.println("Bienvenido al programa de ejemplos de arrays en Java.");
        System.out.println("A continuacion veremos diferentes tipos de arrays y su recorrido.");
        System.out.println("---------------------------------------------------------------");

        // Array de numeros enteros
        int edades[] = {10, 11, 12};

        System.out.println("\nRecorriendo el array de edades (tipo int):");

        for(int i = 0; i < edades.length; i++){
            System.out.println("La edad en la posicion " + i + " es: " + edades[i]);
        }

        // Array de numeros decimales
        double notas[] = {3.5, 4.2, 4.8};

        System.out.println("\nRecorriendo el array de notas (tipo double):");

        for(int i = 0; i < notas.length; i++){
            System.out.println("La nota en la posicion " + i + " es: " + notas[i]);
        }

        // Array de caracteres
        char letras[] = {'A','B','C'};

        System.out.println("\nRecorriendo el array de letras (tipo char):");

        for(int i = 0; i < letras.length; i++){
            System.out.println("La letra en la posicion " + i + " es: " + letras[i]);
        }

        // Array de valores logicos
        boolean estados[] = {true, false, true};

        System.out.println("\nRecorriendo el array de estados (tipo boolean):");

        for(int i = 0; i < estados.length; i++){
            System.out.println("El estado en la posicion " + i + " es: " + estados[i]);
        }

        // Array de texto
        String nombres[] = {"Ana","Luis","Sara"};

        System.out.println("\nRecorriendo el array de nombres (tipo String):");

        for(int i = 0; i < nombres.length; i++){
            System.out.println("El nombre en la posicion " + i + " es: " + nombres[i]);
        }

        // Mensaje final
        System.out.println("\nEl recorrido de los arrays ha finalizado.");
        System.out.println("Gracias por usar el programa PoliTiposArrayRecorrido.");
        System.out.println("Hasta pronto.");

    }
}